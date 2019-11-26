package defpackage;

import android.os.Bundle;

/* renamed from: aobp */
public final class aobp {
    public static anze a(Bundle bundle, String str, anze anze, anxa anxa) {
        return aobp.a((aobs) bundle.getParcelable(str), anze, anxa);
    }

    public static anze a(aobs aobs, anze anze, anxa anxa) {
        anze = anze.getDefaultInstanceForType();
        if (aobs.b == null) {
            aobs.b = anze.toBuilder().mergeFrom(aobs.a, anxa).build();
        }
        return aobs.b;
    }

    public static anze b(Bundle bundle, String str, anze anze, anxa anxa) {
        try {
            return aobp.a(bundle, str, anze, anxa);
        } catch (anyg e) {
            throw new RuntimeException(e);
        }
    }

    public static void a(Bundle bundle, String str, anze anze) {
        bundle.putParcelable(str, new aobs(null, anze));
    }

    public static aobu a(anze anze) {
        return new aobs(null, anze);
    }
}
