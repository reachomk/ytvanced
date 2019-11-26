package defpackage;

import android.content.Context;
import android.os.Parcelable;

/* renamed from: qcn */
public final class qcn {
    public final Object a;

    public qcn(Class cls, Context context, Parcelable parcelable) {
        try {
            this.a = cls.getDeclaredConstructor(new Class[]{Context.class, Parcelable.class}).newInstance(new Object[]{context, parcelable});
        } catch (Exception e) {
            throw new qcl(e);
        }
    }
}
