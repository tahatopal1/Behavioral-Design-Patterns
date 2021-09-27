package Chain;

import Chain.Branch.*;

public class PrvtCargo {

    public static CargoCompany getCargoCompany(){

        CargoCompany istanbulBranch = new IstanbulBranch();
        CargoCompany romeBranch     = new RomeBranch();
        CargoCompany berlinBranch   = new BerlinBranch();
        CargoCompany parisBranch    = new ParisBranch();
        CargoCompany londonBranch   = new LondonBranch();

        return istanbulBranch.setNextCargoCompany(
                romeBranch.setNextCargoCompany(
                        berlinBranch.setNextCargoCompany(
                                parisBranch.setNextCargoCompany(londonBranch))));

    }

}
