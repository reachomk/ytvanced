package defpackage;

import android.os.Parcel;

/* renamed from: xup */
public final class xup {
    public static void a(Parcel parcel, aocf aocf) {
        parcel.writeByteArray(aocf != null ? aocf.toByteArray(aocf) : null);
    }

    public static anze a(Parcel parcel, anze anze) {
        anze build;
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null) {
            try {
                build = anze.toBuilder().mergeFrom(createByteArray, anxa.c()).build();
            } catch (anyg e) {
                throw new IllegalArgumentException(e);
            }
        }
        build = null;
        return build != null ? build : anze;
    }

    public static void a(anze anze, Parcel parcel) {
        parcel.writeByteArray(anze.toByteArray());
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() > 0;
    }
}
