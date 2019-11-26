package com.google.android.gms.gcm;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.qfh;
import defpackage.qfl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class Task implements ReflectedParcelable {
    public final String a;
    public final String b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final Set f;
    private final boolean g;
    private final qfh h;
    private final Bundle i;

    Task(qfl qfl) {
        this.a = qfl.d;
        this.b = qfl.e;
        this.c = qfl.f;
        this.d = qfl.g;
        this.e = qfl.c;
        this.f = qfl.i;
        this.g = qfl.h;
        this.i = qfl.k;
        qfh qfh = qfl.j;
        if (qfh == null) {
            qfh = qfh.a;
        }
        this.h = qfh;
    }

    public final int describeContents() {
        return 0;
    }

    @Deprecated
    Task(Parcel parcel) {
        Log.e("Task", "Constructing a Task object using a parcel.");
        this.a = parcel.readString();
        this.b = parcel.readString();
        boolean z = true;
        this.c = parcel.readInt() == 1;
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.d = z;
        this.e = 2;
        this.f = Collections.emptySet();
        this.g = false;
        this.h = qfh.a;
        this.i = null;
    }

    public void a(Bundle bundle) {
        bundle.putString("tag", this.b);
        bundle.putBoolean("update_current", this.c);
        bundle.putBoolean("persisted", this.d);
        bundle.putString("service", this.a);
        bundle.putInt("requiredNetwork", this.e);
        if (!this.f.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Uri uri : this.f) {
                arrayList.add(uri.toString());
            }
            bundle.putStringArrayList("reachabilityUris", arrayList);
        }
        bundle.putBoolean("requiresCharging", this.g);
        bundle.putBoolean("requiresIdle", false);
        qfh qfh = this.h;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("retry_policy", qfh.b);
        bundle2.putInt("initial_backoff_seconds", qfh.c);
        bundle2.putInt("maximum_backoff_seconds", qfh.d);
        bundle.putBundle("retryStrategy", bundle2);
        bundle.putBundle("extras", this.i);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            Parcel obtain = Parcel.obtain();
            bundle.writeToParcel(obtain, 0);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            if (dataSize <= 10240) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (!((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof String) || (obj instanceof Boolean))) {
                        if (obj instanceof Bundle) {
                            b((Bundle) obj);
                        } else {
                            throw new IllegalArgumentException("Only the following extra parameter types are supported: Integer, Long, Double, String, Boolean, and nested Bundles with the same restrictions.");
                        }
                    }
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder(55);
            stringBuilder.append("Extras exceeding maximum size(10240 bytes): ");
            stringBuilder.append(dataSize);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }
}
