package com.bar.barsys.domain.service;

import com.bar.barsys.domain.entity.Employees;
import com.bar.barsys.domain.repository.EmployeesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("EmployeesService")
public class EmployeesService {
    private final EmployeesRepository employeesRepository;

    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public List<Employees> findAll(){
        return employeesRepository.findAll();
    }

    public Optional<Employees> findByPkId(String id) {
        return employeesRepository.findByPkId(id);
    }

    public Employees createOrUpdate(Employees employees) {
        return this.employeesRepository.save(employees);
    }
//
//    public List<Account_role> findAll() {
//        return this.account_roleRepository.findAll();
//    }
//
//
//    public void delete(Account_role account_role) {
//        this.account_roleRepository.delete(account_role);
//    }
//
//    // SV0002
//    public Integer countByRoleId(String id) {
//        return account_roleRepository.countByRoleId(id);
//    }
//
//    //SV0005
//    public Integer countByAccountUid(String id) {
//        return account_roleRepository.countByAccountUid(id);
//    }
//
//    // RMBCRT
//    @Transactional(rollbackFor = Exception.class)
//    public void deleteAndUpdate(RMBCRTRequest request) {
//
//        String roleId = request.getRoleId();
//        String[] accountIds = request.getAccountIds();
//        // delete the original data
//        this.account_roleRepository.deleteByRoleId(roleId);
//        // update
//        Arrays.stream(accountIds).forEach(t -> {
//            Account_role accountRole = new Account_role();
//            accountRole.setRoleId(roleId);
//            accountRole.setAccountUid(t);
//            this.account_roleRepository.save(accountRole);
//        });
//    }
//
//
//    // ACRCRT
//    @Transactional(rollbackFor = Exception.class)
//    public void insert(ACRCRTRequest request) {
//        // delete the original data
//        this.account_roleRepository.deleteByAccountUid(request.getUid());
//        // update
//        Arrays.stream(request.getRoleIds()).forEach(role -> {
//            Account_role account_role = new Account_role();
//            account_role.setAccountUid(request.getUid());
//            account_role.setRoleId(role);
//            this.account_roleRepository.save(account_role);
//        });
//    }
//
//    public Optional<List<Account_role>> findIsAdminByUid(String accountUid) {
//        return this.account_roleRepository.findIsAdminByUid(accountUid);
//    }
//
//    public List<String> findRoleIdByAccountUid(String uid) {
//        return account_roleRepository.findRoleIdByAccountUid(uid);
//    }
//
//    Optional<List<Account_role>> findByAccountUid(String id){
//        return this.account_roleRepository.findByAccountUid(id);
//    }
//
//	public List<Tuple> findUserPermission(String loginId, int assetId) {
//		return account_roleRepository.findUserPermission(loginId, assetId);
//	}
//
//    public List<String> findUidByRoleId(String roleId) {
//        return account_roleRepository.findUidByRoleId(roleId);
//    }

}
