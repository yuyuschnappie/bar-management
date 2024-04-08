package com.bar.barsys.domain.repository;

import com.bar.barsys.domain.entity.SysSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SysSettingRepository extends JpaRepository<SysSetting, String> {

    @Query("Select sysSetting From SysSetting sysSetting Where sysSetting.category = :category")
    Optional<SysSetting> findByPkCategory(String category);

}
