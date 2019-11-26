package com.google.vr.sdk.proto.nano;

import com.google.vr.sdk.proto.CardboardDevice$CardboardInternalParams;
import com.google.vr.sdk.proto.CardboardDevice$DaydreamInternalParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams$ButtonType;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams$VerticalAlignmentType;
import com.google.vr.sdk.proto.CardboardDevice.CardboardInternalParams.Builder;
import defpackage.anwm;
import defpackage.anxl;
import defpackage.anxo;
import defpackage.anze;
import defpackage.aobv;
import defpackage.aoby;
import defpackage.aoca;
import defpackage.aocd;
import defpackage.aock;
import defpackage.cv;

public final class CardboardDevice$DeviceParams extends aoca implements Cloneable {
    public static volatile CardboardDevice$DeviceParams[] _emptyArray;
    public int bitField0_;
    public float[] blueDistortionCoefficients;
    public CardboardDevice$DaydreamInternalParams daydreamInternal;
    public float[] distortionCoefficients;
    public float[] greenDistortionCoefficients;
    public boolean hasMagnet_;
    public float interLensDistance_;
    public CardboardDevice$CardboardInternalParams internal;
    public float[] leftEyeFieldOfViewAngles;
    public String model_;
    public Integer primaryButton_;
    public float screenToLensDistance_;
    public float trayToLensDistance_;
    public String vendor_;
    public Integer verticalAlignment_;

    public static CardboardDevice$DeviceParams[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (aocd.b) {
                if (_emptyArray == null) {
                    _emptyArray = new CardboardDevice$DeviceParams[0];
                }
            }
        }
        return _emptyArray;
    }

    public final String getVendor() {
        return this.vendor_;
    }

    public final CardboardDevice$DeviceParams setVendor(String str) {
        if (str != null) {
            this.bitField0_ |= 1;
            this.vendor_ = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final String getModel() {
        return this.model_;
    }

    public final CardboardDevice$DeviceParams setModel(String str) {
        if (str != null) {
            this.bitField0_ |= 2;
            this.model_ = str;
            return this;
        }
        throw new NullPointerException();
    }

    public final float getScreenToLensDistance() {
        return this.screenToLensDistance_;
    }

    public final CardboardDevice$DeviceParams setScreenToLensDistance(float f) {
        this.bitField0_ |= 4;
        this.screenToLensDistance_ = f;
        return this;
    }

    public final float getInterLensDistance() {
        return this.interLensDistance_;
    }

    public final CardboardDevice$DeviceParams setInterLensDistance(float f) {
        this.bitField0_ |= 8;
        this.interLensDistance_ = f;
        return this;
    }

    public final CardboardDevice$DeviceParams$VerticalAlignmentType getVerticalAlignment() {
        Integer num = this.verticalAlignment_;
        if (num == null) {
            return CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM;
        }
        return CardboardDevice$DeviceParams$VerticalAlignmentType.forNumber(num.intValue());
    }

    public final CardboardDevice$DeviceParams setVerticalAlignment(CardboardDevice$DeviceParams$VerticalAlignmentType cardboardDevice$DeviceParams$VerticalAlignmentType) {
        this.verticalAlignment_ = cardboardDevice$DeviceParams$VerticalAlignmentType != null ? Integer.valueOf(cardboardDevice$DeviceParams$VerticalAlignmentType.getNumber()) : null;
        this.bitField0_ |= 16;
        return this;
    }

    public final float getTrayToLensDistance() {
        return this.trayToLensDistance_;
    }

    public final CardboardDevice$DeviceParams setTrayToLensDistance(float f) {
        this.bitField0_ |= 32;
        this.trayToLensDistance_ = f;
        return this;
    }

    public final boolean getHasMagnet() {
        return this.hasMagnet_;
    }

    public final CardboardDevice$DeviceParams setHasMagnet(boolean z) {
        this.bitField0_ |= 64;
        this.hasMagnet_ = true;
        return this;
    }

    public CardboardDevice$DeviceParams() {
        clear();
    }

    public final CardboardDevice$DeviceParams clear() {
        this.bitField0_ = 0;
        String str = "";
        this.vendor_ = str;
        this.model_ = str;
        this.screenToLensDistance_ = 0.0f;
        this.interLensDistance_ = 0.0f;
        this.leftEyeFieldOfViewAngles = aock.a;
        this.verticalAlignment_ = CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM != null ? Integer.valueOf(CardboardDevice$DeviceParams$VerticalAlignmentType.BOTTOM.getNumber()) : null;
        this.trayToLensDistance_ = 0.0f;
        this.distortionCoefficients = aock.a;
        this.greenDistortionCoefficients = aock.a;
        this.blueDistortionCoefficients = aock.a;
        this.hasMagnet_ = false;
        this.primaryButton_ = CardboardDevice$DeviceParams$ButtonType.MAGNET != null ? Integer.valueOf(CardboardDevice$DeviceParams$ButtonType.MAGNET.getNumber()) : null;
        this.internal = null;
        this.daydreamInternal = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public final CardboardDevice$DeviceParams clone() {
        try {
            CardboardDevice$DeviceParams cardboardDevice$DeviceParams = (CardboardDevice$DeviceParams) super.clone();
            float[] fArr = this.leftEyeFieldOfViewAngles;
            if (fArr != null && fArr.length > 0) {
                cardboardDevice$DeviceParams.leftEyeFieldOfViewAngles = (float[]) fArr.clone();
            }
            fArr = this.distortionCoefficients;
            if (fArr != null && fArr.length > 0) {
                cardboardDevice$DeviceParams.distortionCoefficients = (float[]) fArr.clone();
            }
            fArr = this.greenDistortionCoefficients;
            if (fArr != null && fArr.length > 0) {
                cardboardDevice$DeviceParams.greenDistortionCoefficients = (float[]) fArr.clone();
            }
            fArr = this.blueDistortionCoefficients;
            if (fArr != null && fArr.length > 0) {
                cardboardDevice$DeviceParams.blueDistortionCoefficients = (float[]) fArr.clone();
            }
            CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = this.internal;
            if (cardboardDevice$CardboardInternalParams != null) {
                cardboardDevice$DeviceParams.internal = cardboardDevice$CardboardInternalParams;
            }
            CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = this.daydreamInternal;
            if (cardboardDevice$DaydreamInternalParams != null) {
                cardboardDevice$DeviceParams.daydreamInternal = cardboardDevice$DaydreamInternalParams;
            }
            return cardboardDevice$DeviceParams;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeTo(aoby aoby) {
        int length;
        float[] fArr;
        Integer num;
        if ((this.bitField0_ & 1) != 0) {
            aoby.a(1, this.vendor_);
        }
        if ((this.bitField0_ & 2) != 0) {
            aoby.a(2, this.model_);
        }
        if ((this.bitField0_ & 4) != 0) {
            aoby.a(3, this.screenToLensDistance_);
        }
        if ((this.bitField0_ & 8) != 0) {
            aoby.a(4, this.interLensDistance_);
        }
        float[] fArr2 = this.leftEyeFieldOfViewAngles;
        int i = 0;
        if (fArr2 != null) {
            length = fArr2.length;
            if (length > 0) {
                aoby.i(42);
                aoby.i(length << 2);
                length = 0;
                while (true) {
                    fArr = this.leftEyeFieldOfViewAngles;
                    if (length >= fArr.length) {
                        break;
                    }
                    aoby.a(fArr[length]);
                    length++;
                }
            }
        }
        if ((this.bitField0_ & 32) != 0) {
            aoby.a(6, this.trayToLensDistance_);
        }
        fArr2 = this.distortionCoefficients;
        if (fArr2 != null) {
            length = fArr2.length;
            if (length > 0) {
                aoby.i(58);
                aoby.i(length << 2);
                length = 0;
                while (true) {
                    fArr = this.distortionCoefficients;
                    if (length >= fArr.length) {
                        break;
                    }
                    aoby.a(fArr[length]);
                    length++;
                }
            }
        }
        fArr2 = this.greenDistortionCoefficients;
        if (fArr2 != null) {
            length = fArr2.length;
            if (length > 0) {
                aoby.i(66);
                aoby.i(length << 2);
                length = 0;
                while (true) {
                    fArr = this.greenDistortionCoefficients;
                    if (length >= fArr.length) {
                        break;
                    }
                    aoby.a(fArr[length]);
                    length++;
                }
            }
        }
        fArr2 = this.blueDistortionCoefficients;
        if (fArr2 != null) {
            length = fArr2.length;
            if (length > 0) {
                aoby.i(74);
                aoby.i(length << 2);
                while (true) {
                    fArr2 = this.blueDistortionCoefficients;
                    if (i >= fArr2.length) {
                        break;
                    }
                    aoby.a(fArr2[i]);
                    i++;
                }
            }
        }
        if ((this.bitField0_ & 64) != 0) {
            aoby.a(10, this.hasMagnet_);
        }
        if ((this.bitField0_ & 16) != 0) {
            num = this.verticalAlignment_;
            if (num != null) {
                aoby.a(11, num.intValue());
            }
        }
        if ((this.bitField0_ & 128) != 0) {
            num = this.primaryButton_;
            if (num != null) {
                aoby.a(12, num.intValue());
            }
        }
        anze anze = this.internal;
        if (anze != null) {
            aoby.a(1729, anze);
        }
        anze = this.daydreamInternal;
        if (anze != null) {
            aoby.a(196883, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int length;
        Integer num;
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.bitField0_ & 1) != 0) {
            computeSerializedSize += aoby.b(1, this.vendor_);
        }
        if ((this.bitField0_ & 2) != 0) {
            computeSerializedSize += aoby.b(2, this.model_);
        }
        if ((this.bitField0_ & 4) != 0) {
            computeSerializedSize += aoby.c(3);
        }
        if ((this.bitField0_ & 8) != 0) {
            computeSerializedSize += aoby.c(4);
        }
        float[] fArr = this.leftEyeFieldOfViewAngles;
        if (fArr != null) {
            length = fArr.length;
            if (length > 0) {
                length <<= 2;
                computeSerializedSize = ((computeSerializedSize + length) + 1) + aoby.j(length);
            }
        }
        if ((this.bitField0_ & 32) != 0) {
            computeSerializedSize += aoby.c(6);
        }
        fArr = this.distortionCoefficients;
        if (fArr != null) {
            length = fArr.length;
            if (length > 0) {
                length <<= 2;
                computeSerializedSize = ((computeSerializedSize + length) + 1) + aoby.j(length);
            }
        }
        fArr = this.greenDistortionCoefficients;
        if (fArr != null) {
            length = fArr.length;
            if (length > 0) {
                length <<= 2;
                computeSerializedSize = ((computeSerializedSize + length) + 1) + aoby.j(length);
            }
        }
        fArr = this.blueDistortionCoefficients;
        if (fArr != null) {
            length = fArr.length;
            if (length > 0) {
                length <<= 2;
                computeSerializedSize = ((computeSerializedSize + length) + 1) + aoby.j(length);
            }
        }
        if ((this.bitField0_ & 64) != 0) {
            computeSerializedSize += aoby.d(10);
        }
        if ((this.bitField0_ & 16) != 0) {
            num = this.verticalAlignment_;
            if (num != null) {
                computeSerializedSize += aoby.c(11, num.intValue());
            }
        }
        if ((this.bitField0_ & 128) != 0) {
            num = this.primaryButton_;
            if (num != null) {
                computeSerializedSize += aoby.c(12, num.intValue());
            }
        }
        anze anze = this.internal;
        if (anze != null) {
            computeSerializedSize += anwm.c(1729, anze);
        }
        anze = this.daydreamInternal;
        return anze != null ? computeSerializedSize + anwm.c(196883, anze) : computeSerializedSize;
    }

    public final CardboardDevice$DeviceParams mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int c;
            float[] fArr;
            int length;
            float[] fArr2;
            float[] fArr3;
            int length2;
            int i;
            switch (a) {
                case 0:
                    return this;
                case 10:
                    this.vendor_ = aobv.d();
                    this.bitField0_ |= 1;
                    break;
                case 18:
                    this.model_ = aobv.d();
                    this.bitField0_ |= 2;
                    break;
                case 29:
                    this.screenToLensDistance_ = aobv.b();
                    this.bitField0_ |= 4;
                    break;
                case 37:
                    this.interLensDistance_ = aobv.b();
                    this.bitField0_ |= 8;
                    break;
                case 42:
                    a = aobv.f();
                    c = aobv.c(a);
                    a /= 4;
                    fArr = this.leftEyeFieldOfViewAngles;
                    length = fArr != null ? fArr.length : 0;
                    fArr2 = new float[(a + length)];
                    if (length != 0) {
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                    }
                    while (length < fArr2.length) {
                        fArr2[length] = aobv.b();
                        length++;
                    }
                    this.leftEyeFieldOfViewAngles = fArr2;
                    aobv.d(c);
                    break;
                case 45:
                    a = aock.a(aobv, 45);
                    fArr3 = this.leftEyeFieldOfViewAngles;
                    length2 = fArr3 != null ? fArr3.length : 0;
                    fArr2 = new float[(a + length2)];
                    if (length2 != 0) {
                        System.arraycopy(fArr3, 0, fArr2, 0, length2);
                    }
                    while (length2 < fArr2.length - 1) {
                        fArr2[length2] = aobv.b();
                        aobv.a();
                        length2++;
                    }
                    fArr2[length2] = aobv.b();
                    this.leftEyeFieldOfViewAngles = fArr2;
                    break;
                case cv.aX /*53*/:
                    this.trayToLensDistance_ = aobv.b();
                    this.bitField0_ |= 32;
                    break;
                case 58:
                    a = aobv.f();
                    c = aobv.c(a);
                    a /= 4;
                    fArr = this.distortionCoefficients;
                    length = fArr != null ? fArr.length : 0;
                    fArr2 = new float[(a + length)];
                    if (length != 0) {
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                    }
                    while (length < fArr2.length) {
                        fArr2[length] = aobv.b();
                        length++;
                    }
                    this.distortionCoefficients = fArr2;
                    aobv.d(c);
                    break;
                case cv.be /*61*/:
                    a = aock.a(aobv, 61);
                    fArr3 = this.distortionCoefficients;
                    length2 = fArr3 != null ? fArr3.length : 0;
                    fArr2 = new float[(a + length2)];
                    if (length2 != 0) {
                        System.arraycopy(fArr3, 0, fArr2, 0, length2);
                    }
                    while (length2 < fArr2.length - 1) {
                        fArr2[length2] = aobv.b();
                        aobv.a();
                        length2++;
                    }
                    fArr2[length2] = aobv.b();
                    this.distortionCoefficients = fArr2;
                    break;
                case 66:
                    a = aobv.f();
                    c = aobv.c(a);
                    a /= 4;
                    fArr = this.greenDistortionCoefficients;
                    length = fArr != null ? fArr.length : 0;
                    fArr2 = new float[(a + length)];
                    if (length != 0) {
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                    }
                    while (length < fArr2.length) {
                        fArr2[length] = aobv.b();
                        length++;
                    }
                    this.greenDistortionCoefficients = fArr2;
                    aobv.d(c);
                    break;
                case 69:
                    a = aock.a(aobv, 69);
                    fArr3 = this.greenDistortionCoefficients;
                    length2 = fArr3 != null ? fArr3.length : 0;
                    fArr2 = new float[(a + length2)];
                    if (length2 != 0) {
                        System.arraycopy(fArr3, 0, fArr2, 0, length2);
                    }
                    while (length2 < fArr2.length - 1) {
                        fArr2[length2] = aobv.b();
                        aobv.a();
                        length2++;
                    }
                    fArr2[length2] = aobv.b();
                    this.greenDistortionCoefficients = fArr2;
                    break;
                case 74:
                    a = aobv.f();
                    c = aobv.c(a);
                    a /= 4;
                    fArr = this.blueDistortionCoefficients;
                    length = fArr != null ? fArr.length : 0;
                    fArr2 = new float[(a + length)];
                    if (length != 0) {
                        System.arraycopy(fArr, 0, fArr2, 0, length);
                    }
                    while (length < fArr2.length) {
                        fArr2[length] = aobv.b();
                        length++;
                    }
                    this.blueDistortionCoefficients = fArr2;
                    aobv.d(c);
                    break;
                case 77:
                    a = aock.a(aobv, 77);
                    fArr3 = this.blueDistortionCoefficients;
                    length2 = fArr3 != null ? fArr3.length : 0;
                    fArr2 = new float[(a + length2)];
                    if (length2 != 0) {
                        System.arraycopy(fArr3, 0, fArr2, 0, length2);
                    }
                    while (length2 < fArr2.length - 1) {
                        fArr2[length2] = aobv.b();
                        aobv.a();
                        length2++;
                    }
                    fArr2[length2] = aobv.b();
                    this.blueDistortionCoefficients = fArr2;
                    break;
                case 80:
                    this.hasMagnet_ = aobv.c();
                    this.bitField0_ |= 64;
                    break;
                case 88:
                    this.bitField0_ |= 16;
                    i = aobv.b;
                    length = aobv.f();
                    if (length != 0 && length != 1 && length != 2) {
                        aobv.e(i);
                        storeUnknownField(aobv, a);
                        break;
                    }
                    this.verticalAlignment_ = Integer.valueOf(length);
                    this.bitField0_ |= 16;
                    break;
                case 96:
                    this.bitField0_ |= 128;
                    i = aobv.b;
                    length = aobv.f();
                    if (length != 0 && length != 1 && length != 2 && length != 3) {
                        aobv.e(i);
                        storeUnknownField(aobv, a);
                        break;
                    }
                    this.primaryButton_ = Integer.valueOf(length);
                    this.bitField0_ |= 128;
                    break;
                case 13834:
                    CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = (CardboardDevice$CardboardInternalParams) aobv.a(CardboardDevice$CardboardInternalParams.parser());
                    CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams2 = this.internal;
                    if (cardboardDevice$CardboardInternalParams2 != null) {
                        Builder builder = (Builder) ((anxo) cardboardDevice$CardboardInternalParams2.toBuilder());
                        builder.mergeFrom(cardboardDevice$CardboardInternalParams);
                        cardboardDevice$CardboardInternalParams = (CardboardDevice$CardboardInternalParams) ((anxl) builder.build());
                    }
                    this.internal = cardboardDevice$CardboardInternalParams;
                    break;
                case 1575066:
                    CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = (CardboardDevice$DaydreamInternalParams) aobv.a(CardboardDevice$DaydreamInternalParams.parser());
                    CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams2 = this.daydreamInternal;
                    if (cardboardDevice$DaydreamInternalParams2 != null) {
                        CardboardDevice$DaydreamInternalParams.Builder builder2 = (CardboardDevice$DaydreamInternalParams.Builder) ((anxo) cardboardDevice$DaydreamInternalParams2.toBuilder());
                        builder2.mergeFrom(cardboardDevice$DaydreamInternalParams);
                        cardboardDevice$DaydreamInternalParams = (CardboardDevice$DaydreamInternalParams) ((anxl) builder2.build());
                    }
                    this.daydreamInternal = cardboardDevice$DaydreamInternalParams;
                    break;
                default:
                    if (super.storeUnknownField(aobv, a)) {
                        break;
                    }
                    return this;
            }
        }
    }
}
