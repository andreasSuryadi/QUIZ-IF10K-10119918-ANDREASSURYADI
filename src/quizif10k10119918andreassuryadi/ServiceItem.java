/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizif10k10119918andreassuryadi;

/**
 *
 * @author andreas
 */
public interface ServiceItem {
    public void displayService();
    
    public float getPrice(int serviceItem);
    
    public boolean checkMemberStatus(String statusMember);
    
    public float getSale(boolean isMember, float parServicePrice);
}
