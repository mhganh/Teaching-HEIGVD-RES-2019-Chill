package ch.heigvd.res.chill.domain.ncdm_stldr;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class JaggerMeister implements IProduct {
    public final static String NAME = "JaggerMeister";
    public final static BigDecimal PRICE = new BigDecimal(5.5);

    @Override
    public String getName(){return NAME;}

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}