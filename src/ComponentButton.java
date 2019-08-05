import javax.swing.JButton;
//按钮类
class ComponentButton extends JButton{
    private static final long serialVersionUID = 1L;
    public String context;
    ComponentButton(int number){
        super(String.valueOf(number));
        this.context = String.valueOf(number);
    }
    ComponentButton(String symble){
        super(symble);
        this.context = symble;
    }
    ComponentButton(){
        
    }
    public String getContext(){
        return this.context;
    }
    public void setContest(String context){
        this.context = context;
    }
}