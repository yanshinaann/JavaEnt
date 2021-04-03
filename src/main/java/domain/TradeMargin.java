package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TradeMargin {
    GasolineType gasolineType;
    Integer weekDay;
    private double gasolinePrice;
}
