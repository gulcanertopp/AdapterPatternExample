package dusman;

/**
 *
 * @author gulcanertop
 */
public class DusmanRobotuAdapter implements IDusman{ 
    
    DusmanRobotu dRobot;
    
    public DusmanRobotuAdapter(DusmanRobotu gelenrobot)
    {
        this.dRobot = gelenrobot;
    }

    @Override
    public void DusmanAdi(String dusmanAdi) {
    dRobot.RobotAdi(dusmanAdi);
    }
    @Override
    public void SilahKullan() {
     dRobot.BombaAt();}

    @Override
    public void Hizlan() {
    dRobot.UcusaGec();}
    
    
}
