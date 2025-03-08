package States;
import java.util.List;
import CoinTypes.CoinTypes;
import Items.Item;

public interface StateInterface {
    void clickOnInsertCoinButton() throws Exception;
    void insertCoin(CoinTypes cn) throws Exception;
    void clickOnStartProductSelectionButton() throws Exception;
    void chooseProduct(int codeNumber) throws Exception;
    int getChange(int returnChangeMoney) throws Exception;
    List<CoinTypes> refundFullMoney() throws Exception;
    Item dispenseProduct() throws Exception;
    void updateInventory(int code) throws Exception;
    void getStateName() throws Exception;
}
