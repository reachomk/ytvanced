package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: bie */
public final class bie implements Parcelable {
    public static final Creator CREATOR = new bih();
    public final bil a;

    public bie(bil bil) {
        this.a = bil;
    }

    public final int describeContents() {
        return 0;
    }

    protected bie(Parcel parcel) {
        bii bii = new bii(parcel);
        String readString = bii.a.readString();
        bil bil = null;
        if (readString != null) {
            bij b = bii.b();
            try {
                Method method = (Method) bii.b.get(readString);
                if (method == null) {
                    System.currentTimeMillis();
                    method = Class.forName(readString, true, bij.class.getClassLoader()).getDeclaredMethod("read", new Class[]{bij.class});
                    bii.b.put(readString, method);
                }
                bil = (bil) method.invoke(null, new Object[]{b});
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        }
        this.a = bil;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        bii bii = new bii(parcel);
        bil bil = this.a;
        if (bil == null) {
            bii.a(null);
            return;
        }
        try {
            bii.a(bii.a(bil.getClass()).getName());
            bij b = bii.b();
            try {
                Class cls = bil.getClass();
                Method method = (Method) bii.c.get(cls.getName());
                if (method == null) {
                    Class a = bii.a(cls);
                    System.currentTimeMillis();
                    method = a.getDeclaredMethod("write", new Class[]{cls, bij.class});
                    bii.c.put(cls.getName(), method);
                }
                method.invoke(null, new Object[]{bil, b});
                b.a();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(bil.getClass().getSimpleName());
            stringBuilder.append(" does not have a Parcelizer");
            throw new RuntimeException(stringBuilder.toString(), e5);
        }
    }
}
