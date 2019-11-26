package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rxk */
public final class rxk implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        byte[] bArr = str;
        byte[][] bArr2 = bArr;
        byte[][] bArr3 = bArr2;
        byte[][] bArr4 = bArr3;
        byte[][] bArr5 = bArr4;
        int[] iArr = bArr5;
        byte[][] bArr6 = iArr;
        int[] iArr2 = bArr6;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel, readInt);
                    break;
                case 3:
                    bArr = qot.m(parcel, readInt);
                    break;
                case 4:
                    bArr2 = qot.n(parcel, readInt);
                    break;
                case 5:
                    bArr3 = qot.n(parcel, readInt);
                    break;
                case 6:
                    bArr4 = qot.n(parcel, readInt);
                    break;
                case 7:
                    bArr5 = qot.n(parcel, readInt);
                    break;
                case 8:
                    iArr = qot.o(parcel, readInt);
                    break;
                case 9:
                    bArr6 = qot.n(parcel, readInt);
                    break;
                case 10:
                    iArr2 = qot.o(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new rvw(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2);
    }
}
