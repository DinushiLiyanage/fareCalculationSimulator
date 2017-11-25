/*
 * IT15018960
 * D.U. Liyanage  * 
 * CSSE-02  * 
 */
package fareCalculation.model;

/**
 *
 * @author D.U.Liyanage *
 */
public class Token {

    private final Integer tokenId;
    private int packageId;
    public Token(int tokenID) {
        this.tokenId = tokenID;
    }

    //getters
    public Integer getTokenId() {
        return tokenId;
    }

    public Integer getPackageId() {
        return packageId;
    }
}
