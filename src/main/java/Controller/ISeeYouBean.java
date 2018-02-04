/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import com.maxmind.geoip.*;
import Model.Entry;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Mark
 */
@Named(value = "iSeeYouBean")
@RequestScoped
public class ISeeYouBean {

    @Inject
    private HttpServletRequest request;

    private String ip;
    private Entry entry;

    /**
     * Creates a new instance of ISeeYouBean
     */
    public ISeeYouBean() {
    }

    public String getIp() {
        return request.getRemoteAddr();
    }
}
