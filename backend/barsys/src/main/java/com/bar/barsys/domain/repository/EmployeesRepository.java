package com.bar.barsys.domain.repository;

import com.bar.barsys.domain.entity.Employees;
import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, String> {

    @Query("Select account_role From Employees account_role Where account_role.id = :id")
    Optional<Employees> findByPkId(String id);

//    //SV0002
//    @Query("Select Count(1) From Account_role account_role Where account_role.roleId = :id")
//    Integer countByRoleId(String id);
//
//    //SV0005
//    @Query("Select Count(1) From Account_role account_role Where account_role.accountUid = :id")
//    Integer countByAccountUid(String id);
//
//    // RMBCRT
//    @Modifying
//    @Query("Delete From Account_role ar Where ar.roleId = :roleId")
//    void deleteByRoleId(String roleId);
//
//    @Query("Select ar.roleId From Account_role ar Where ar.accountUid = :uid")
//    List<String> findRoleIdByAccountUid(String uid);
//
//    @Query("Select account_role From Account_role account_role Where account_role.accountUid = :id")
//    Optional<List<Account_role>> findByAccountUid(String id);
//
//    @Modifying
//    @Query("Delete From Account_role account_role Where account_role.accountUid = :accountUid")
//    void deleteByAccountUid(String accountUid);
//
//    @Query("Select account_role From Account_role account_role Where account_role.accountUid = :accountUid and account_role.roleId in (select role.id from Role role where role.isAdmin = true)")
//    Optional<List<Account_role>> findIsAdminByUid(String accountUid);
//
//    @Query("select erole.isAdmin as isAdmin ,erole.isDepAuth as isDepAuth ,va.custodian as custodian  from Account_role accrole " + " inner join Role erole on accrole.roleId = erole.id " + " left join V_asset va on accrole.accountUid  =  va.custodian and va.id = :assetId" + " where accrole.accountUid = :loginId")
//    List<Tuple> findUserPermission(@Param("loginId") String loginId, @Param("assetId") Integer assetId);
//
//    @Query("select ar.accountUid from Account_role ar where ar.roleId = :roleId")
//    List<String> findUidByRoleId(String roleId);
}
