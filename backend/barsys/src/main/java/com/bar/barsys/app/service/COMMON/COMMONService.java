package com.bar.barsys.app.service.COMMON;

import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

@Service("COMMONService")
public class COMMONService {
    // 加鹽
    public String salt() {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return Base64.getEncoder().encodeToString(salt);
    }

    // SHA-1 加密
    public String hashPassword(String password, String salt) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            // 進行雜湊
            String passwordWithSalt = password + salt;
            byte[] hash = digest.digest(passwordWithSalt.getBytes());
            // 轉Base64
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
}


