package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: qnl */
public final class qnl extends riy implements qnm {
    qnl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    public final pnu a(qcs qcs, pko pko, qno qno, Map map) {
        pnu pnx;
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (Parcelable) pko);
        rjz.a(aX_, (IInterface) qno);
        aX_.writeMap(map);
        Parcel a = a(1, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            pnx = queryLocalInterface instanceof pnu ? (pnu) queryLocalInterface : new pnx(readStrongBinder);
        } else {
            pnx = null;
        }
        a.recycle();
        return pnx;
    }

    public final poc a(String str, String str2, pnm pnm) {
        poc pof;
        Parcel aX_ = aX_();
        aX_.writeString(str);
        aX_.writeString(str2);
        rjz.a(aX_, (IInterface) pnm);
        Parcel a = a(2, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            pof = queryLocalInterface instanceof poc ? (poc) queryLocalInterface : new pof(readStrongBinder);
        } else {
            pof = null;
        }
        a.recycle();
        return pof;
    }

    public final pnw a(pko pko, qcs qcs, pns pns) {
        pnw pnz;
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) pko);
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (IInterface) pns);
        Parcel a = a(3, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            pnz = queryLocalInterface instanceof pnw ? (pnw) queryLocalInterface : new pnz(readStrongBinder);
        } else {
            pnz = null;
        }
        a.recycle();
        return pnz;
    }

    public final poa a(qcs qcs, qcs qcs2, qcs qcs3) {
        poa pod;
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (IInterface) qcs2);
        rjz.a(aX_, (IInterface) qcs3);
        Parcel a = a(5, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            pod = queryLocalInterface instanceof poa ? (poa) queryLocalInterface : new pod(readStrongBinder);
        } else {
            pod = null;
        }
        a.recycle();
        return pod;
    }

    public final qnz a(qcs qcs, qob qob, int i, int i2) {
        qnz qoc;
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        rjz.a(aX_, (IInterface) qob);
        aX_.writeInt(i);
        aX_.writeInt(i2);
        rjz.a(aX_, false);
        aX_.writeLong(2097152);
        aX_.writeInt(5);
        aX_.writeInt(333);
        aX_.writeInt(10000);
        Parcel a = a(6, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            qoc = queryLocalInterface instanceof qnz ? (qnz) queryLocalInterface : new qoc(readStrongBinder);
        } else {
            qoc = null;
        }
        a.recycle();
        return qoc;
    }
}
