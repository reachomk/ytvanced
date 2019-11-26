package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

/* renamed from: rzq */
public final class rzq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new BuyFlowConfig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        rzk rzk = str;
        String str2 = rzk;
        String str3 = str2;
        String str4 = str3;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                rzk = (rzk) qot.a(parcel, readInt, rzk.CREATOR);
            } else if (c == 4) {
                str2 = qot.j(parcel, readInt);
            } else if (c == 5) {
                str3 = qot.j(parcel, readInt);
            } else if (c != 6) {
                qot.b(parcel, readInt);
            } else {
                str4 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new BuyFlowConfig(str, rzk, str2, str3, str4);
    }
}
