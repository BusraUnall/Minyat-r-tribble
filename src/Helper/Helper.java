
package Helper;

import View.demo;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Helper {
    public static void optionPaneChangeButtonText(){
    UIManager.put("OptionPane.calcelButtonText", "İptal");
    UIManager.put("OptionPane.noButtonText", "Hayır");
    UIManager.put("OptionPane.yesButtonText", "Evet");
    UIManager.put("OptionPane.okButtonText", "Tamam");
    }
    public static void showMsg(String str){
        optionPaneChangeButtonText();
        String msg;
        switch(str){
            case "fill":
                msg="Lütfen tüm alanları doldurunuz.";
                break;
            default:
            msg=str;
    }
        JOptionPane.showMessageDialog(null,msg,"Mesaj",JOptionPane.INFORMATION_MESSAGE);
    }
    public static boolean confirm(String str){
        optionPaneChangeButtonText();
        String msg;
        switch(str){
             case "sure":
                   msg="Bu işlemi gerçekleştirmek istiyor musunuz?";
                   break;
             default:
             msg=str;
             break;}
        int res=JOptionPane.showConfirmDialog(null, msg,"Dikkat!",JOptionPane.YES_NO_OPTION);
             if(res==0){
                   return true;}
             else{
                   return false;
    }
    }
 


}