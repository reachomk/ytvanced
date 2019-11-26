package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.lang.reflect.InvocationTargetException;

/* renamed from: fiw */
public final class fiw implements Parcelable {
    public static final Creator CREATOR = new fiv();
    public final Class a;
    public final Bundle b;
    public amqv c;

    public fiw(Class cls, Bundle bundle) {
        amqw.a((Object) cls);
        amqw.a((Object) bundle);
        this.a = cls;
        this.b = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    public final void a(ClassLoader classLoader) {
        this.b.setClassLoader(classLoader);
    }

    public final void a(apxu apxu) {
        this.b.putByteArray("navigation_endpoint", apxu.toByteArray());
    }

    public final void a(avjf avjf) {
        this.b.putByteArray("navigation_endpoint_interaction_logging_extension", avjf.toByteArray());
    }

    public final apxu a() {
        return fiw.b(this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.getName());
        parcel.writeParcelable(this.b, i);
    }

    public static boolean a(fiw fiw, fiw fiw2, aaal aaal) {
        if (fiw == fiw2) {
            return true;
        }
        if (fiw != null && fiw2 != null && fiw.a == fiw2.a && xvw.a(fiw.a(fiw.b), fiw.a(fiw2.b))) {
            Bundle bundle = fiw.b;
            Bundle bundle2 = fiw2.b;
            String str = "navigation_endpoint";
            boolean containsKey = bundle.containsKey(str);
            boolean containsKey2 = bundle2.containsKey(str);
            return containsKey == containsKey2 && (!(containsKey || containsKey2) || aaal.a(fiw.b(bundle), fiw.b(bundle2)));
        }
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public static Bundle b() {
        return new Bundle();
    }

    public static fiw a(fja fja) {
        amqw.a((Object) fja);
        Bundle bundle = fja.j;
        Class cls = fja.getClass();
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new fiw(cls, bundle);
    }

    public static fiw a(Class cls, apxu apxu) {
        return fiw.a(cls, apxu, fiw.b());
    }

    public static fiw a(Class cls, apxu apxu, Bundle bundle) {
        amqw.a((Object) apxu);
        fiw fiw = new fiw(cls, bundle);
        fiw.a(apxu);
        return fiw;
    }

    private static Bundle a(Bundle bundle) {
        Bundle bundle2 = null;
        for (String str : ebo.a) {
            if (bundle.containsKey(str)) {
                if (bundle2 == null) {
                    bundle2 = new Bundle(bundle);
                }
                bundle2.remove(str);
            }
        }
        return bundle2 != null ? bundle2 : bundle;
    }

    private static apxu b(Bundle bundle) {
        return aaax.b(bundle.getByteArray("navigation_endpoint"));
    }

    public final fja c() {
        nf nfVar;
        try {
            nfVar = (fja) this.a.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            nfVar = null;
        }
        if (nfVar != null) {
            nfVar.f(new Bundle(this.b));
        }
        return nfVar;
    }

    public final boolean d() {
        return this.b.getBoolean("home_pane", false);
    }

    public final boolean e() {
        return this.b.getBoolean("pivot", false);
    }

    public final String a(String str) {
        return this.b.getString(str);
    }

    /* synthetic */ fiw(Parcel parcel) {
        try {
            this.a = Class.forName(parcel.readString());
            ClassLoader classLoader = getClass().getClassLoader();
            this.b = (Bundle) parcel.readParcelable(classLoader);
            Bundle bundle = this.b;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException("Failed to read fragmentClass.");
        }
    }
}
