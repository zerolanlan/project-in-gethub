package AWT����;
import java.awt.*;
public class FlowLayout {

	public static void main(String[] args) {
		final Frame f = new Frame("FlowLayout");
        //���ò��ֹ�����ΪFlowLayout�������������룬ˮƽ���Ϊ20����ֱ���Ϊ30
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
		f.setSize(220,300);
		f.setLocation(300,200);
		f.add(comp, constraints);
	}

}
