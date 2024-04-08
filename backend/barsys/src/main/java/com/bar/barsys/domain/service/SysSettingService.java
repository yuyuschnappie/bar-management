package com.bar.barsys.domain.service;

import com.bar.barsys.domain.entity.SysSetting;
import com.bar.barsys.domain.repository.SysSettingRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SysSettingService")
public class SysSettingService {
    private final SysSettingRepository sysSettingRepository;

    public SysSettingService(SysSettingRepository sysSettingRepository) {
        this.sysSettingRepository = sysSettingRepository;
    }

    public List<SysSetting> findAll() {
        return sysSettingRepository.findAll();
    }

    public Optional<SysSetting> findByPkCategory(String category) {
        return sysSettingRepository.findByPkCategory(category);
    }

    public SysSetting createOrUpdate(SysSetting sysSetting) {
        return this.sysSettingRepository.save(sysSetting);
    }


}
