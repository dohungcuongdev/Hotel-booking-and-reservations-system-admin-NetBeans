/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import service.application.FileUploadService;
import service.application.MailService;
import service.application.StringUtils;
import service.ApplicationService;

/**
 *
 * @author HUNGCUONG
 */
public class ApplicationServiceImp implements ApplicationService {

    @Override
    public String uploadfile(CommonsMultipartFile commonsMultipartFiles, HttpServletRequest request, ModelMap model, String itemType) {
        return FileUploadService.uploadfile(commonsMultipartFiles, request, model, itemType);
    }

    @Override
    public String sendEmail(String message, String sendto, String subject) {
        return MailService.sendEmail(message, sendto, subject);
    }

    @Override
    public String removeAccent(String originalString) {
        return StringUtils.removeAccent(originalString);
    }
    
}
