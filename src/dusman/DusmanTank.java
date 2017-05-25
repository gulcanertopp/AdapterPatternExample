
package dusman;

/**
 *
 * @author gulcanertop
 */
public class DusmanTank implements IDusman{

    @Override
    public void SilahKullan() {
        System.out.println("Tank Silahı");
    }

    @Override
    public void Hizlan() {
        System.out.println("Tank Hızlan");
    }

    @Override
    public void DusmanAdi(String dusmanAdi) {
        System.out.println("Dusman Adi= " + dusmanAdi );
    }


}
