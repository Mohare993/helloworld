package helloworld.persistance.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.security.auth.login.AccountNotFoundException;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import helloworld.Account;
import util.JSONUtil;


@Transactional
public class AccountMapDBImp {

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	private JSONUtil json = new JSONUtil();
	
	public List<Account> findAllAccounts() {
        TypedQuery<Account> query = em.createQuery("SELECT a FROM Account a ORDER BY a.firstName DESC", Account.class);
        return query.getResultList();
    }

	public Account finAnAccount(Long id) {
        return em.find(Account.class, id);
    }

    
    @Transactional (value=TxType.REQUIRED)
    public String createAnAccount(String account) {
    	Account acc = json.getObjectForJSON(account, Account.class);
        em.persist(acc);
        return "{\"message\": \"Account sucessfully added\"}";
    }
    
    @Transactional (value=TxType.REQUIRED)
    public String updateAnAccount(Long id, String account) throws AccountNotFoundException {
    	
    	Account newAcc = this.json.getObjectForJSON(account, Account.class);
    	Account oldAcc = em.find(Account.class, id);
    	if (oldAcc == null) {
    		throw new AccountNotFoundException();
    	}
    	oldAcc.setAccountNumber(newAcc.getAccountNumber());
    	oldAcc.setFirstName(newAcc.getFirstName());
    	oldAcc.setLastName(newAcc.getLastName());
    	em.persist(oldAcc);
    	return "{\"message\": \"Account sucessfully updated.\"}";
    }
    
    @Transactional (value=TxType.REQUIRED)
    public void deleteAccount(Long id) {
        Account a = em.find(Account.class, id);
        em.remove(a);
    }
    
    

    


	
	


}
