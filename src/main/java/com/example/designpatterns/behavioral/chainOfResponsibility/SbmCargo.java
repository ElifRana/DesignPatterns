package com.example.designpatterns.behavioral.chainOfResponsibility;

public class SbmCargo {

    public static ShippingCompany getShippingCompany(){

        CankiriBranch cankiriBranch = new CankiriBranch();
        AnkaraBranch ankaraBranch = new AnkaraBranch();
        IstanbulBranch istanbulBranch = new IstanbulBranch();
        AnlatyaBranch anlatyaBranch = new AnlatyaBranch();

         ShippingCompany sbmCargo = cankiriBranch
                .setLastShippingCompany(ankaraBranch
                        .setLastShippingCompany(istanbulBranch
                                .setLastShippingCompany(anlatyaBranch)
                        )
                );

         return sbmCargo;
    }
}
