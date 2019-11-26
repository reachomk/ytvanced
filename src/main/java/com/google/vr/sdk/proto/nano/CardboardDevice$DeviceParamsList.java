package com.google.vr.sdk.proto.nano;

import defpackage.aobv;
import defpackage.aoby;
import defpackage.aoca;
import defpackage.aocf;
import defpackage.aock;

public final class CardboardDevice$DeviceParamsList extends aoca implements Cloneable {
    public static volatile CardboardDevice$DeviceParamsList[] _emptyArray;
    public CardboardDevice$DeviceParams[] params;

    public CardboardDevice$DeviceParamsList() {
        clear();
    }

    public final CardboardDevice$DeviceParamsList clear() {
        this.params = CardboardDevice$DeviceParams.emptyArray();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final CardboardDevice$DeviceParamsList clone() {
        try {
            CardboardDevice$DeviceParamsList cardboardDevice$DeviceParamsList = (CardboardDevice$DeviceParamsList) super.clone();
            CardboardDevice$DeviceParams[] cardboardDevice$DeviceParamsArr = this.params;
            if (cardboardDevice$DeviceParamsArr != null) {
                int length = cardboardDevice$DeviceParamsArr.length;
                if (length > 0) {
                    cardboardDevice$DeviceParamsList.params = new CardboardDevice$DeviceParams[length];
                    length = 0;
                    while (true) {
                        CardboardDevice$DeviceParams[] cardboardDevice$DeviceParamsArr2 = this.params;
                        if (length >= cardboardDevice$DeviceParamsArr2.length) {
                            break;
                        }
                        aocf aocf = cardboardDevice$DeviceParamsArr2[length];
                        if (aocf != null) {
                            cardboardDevice$DeviceParamsList.params[length] = (CardboardDevice$DeviceParams) aocf.clone();
                        }
                        length++;
                    }
                }
            }
            return cardboardDevice$DeviceParamsList;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeTo(aoby aoby) {
        CardboardDevice$DeviceParams[] cardboardDevice$DeviceParamsArr = this.params;
        if (cardboardDevice$DeviceParamsArr != null && cardboardDevice$DeviceParamsArr.length > 0) {
            int i = 0;
            while (true) {
                CardboardDevice$DeviceParams[] cardboardDevice$DeviceParamsArr2 = this.params;
                if (i >= cardboardDevice$DeviceParamsArr2.length) {
                    break;
                }
                aocf aocf = cardboardDevice$DeviceParamsArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        CardboardDevice$DeviceParams[] cardboardDevice$DeviceParamsArr = this.params;
        if (cardboardDevice$DeviceParamsArr != null && cardboardDevice$DeviceParamsArr.length > 0) {
            int i = 0;
            while (true) {
                CardboardDevice$DeviceParams[] cardboardDevice$DeviceParamsArr2 = this.params;
                if (i >= cardboardDevice$DeviceParamsArr2.length) {
                    break;
                }
                aocf aocf = cardboardDevice$DeviceParamsArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final CardboardDevice$DeviceParamsList mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                return this;
            }
            if (a == 10) {
                aocf cardboardDevice$DeviceParams;
                a = aock.a(aobv, 10);
                CardboardDevice$DeviceParams[] cardboardDevice$DeviceParamsArr = this.params;
                int length = cardboardDevice$DeviceParamsArr != null ? cardboardDevice$DeviceParamsArr.length : 0;
                CardboardDevice$DeviceParams[] cardboardDevice$DeviceParamsArr2 = new CardboardDevice$DeviceParams[(a + length)];
                if (length != 0) {
                    System.arraycopy(cardboardDevice$DeviceParamsArr, 0, cardboardDevice$DeviceParamsArr2, 0, length);
                }
                while (length < cardboardDevice$DeviceParamsArr2.length - 1) {
                    cardboardDevice$DeviceParams = new CardboardDevice$DeviceParams();
                    cardboardDevice$DeviceParamsArr2[length] = cardboardDevice$DeviceParams;
                    aobv.a(cardboardDevice$DeviceParams);
                    aobv.a();
                    length++;
                }
                cardboardDevice$DeviceParams = new CardboardDevice$DeviceParams();
                cardboardDevice$DeviceParamsArr2[length] = cardboardDevice$DeviceParams;
                aobv.a(cardboardDevice$DeviceParams);
                this.params = cardboardDevice$DeviceParamsArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                return this;
            }
        }
    }
}
