package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import java.util.Arrays;

@qlp
/* renamed from: qmg */
public final class qmg extends qou {
    public static final Creator CREATOR = new qmf();
    private final String a;
    private final int b;

    public qmg(ped ped) {
        qlx qlx = (qlx) ped;
        qls qls = qlx.a;
        String str = null;
        if (qls != null) {
            try {
                str = qls.a();
            } catch (RemoteException e) {
                qml.b("Could not forward getType to RewardItem", e);
            }
        }
        qls qls2 = qlx.a;
        int i = 0;
        if (qls2 != null) {
            try {
                i = qls2.b();
            } catch (RemoteException e2) {
                qml.b("Could not forward getAmount to RewardItem", e2);
            }
        }
        this(str, i);
    }

    public qmg(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof qmg)) {
            qmg qmg = (qmg) obj;
            if (pzj.a(this.a, qmg.a) && pzj.a(Integer.valueOf(this.b), Integer.valueOf(qmg.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b)});
    }
}
