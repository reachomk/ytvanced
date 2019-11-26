package defpackage;

import android.util.JsonReader;
import java.util.List;

/* renamed from: boh */
public final class boh {
    public static bmo a(JsonReader jsonReader, bjj bjj) {
        return boh.a(jsonReader, bjj, true);
    }

    public static bmo a(JsonReader jsonReader, bjj bjj, boolean z) {
        return new bmo(bor.a(jsonReader, bjj, z ? bpg.a() : 1.0f, bol.a));
    }

    static bmq b(JsonReader jsonReader, bjj bjj) {
        return new bmq(boh.a(jsonReader, bjj, bon.a));
    }

    static bms c(JsonReader jsonReader, bjj bjj) {
        return new bms(bor.a(jsonReader, bjj, bpg.a(), bow.a));
    }

    static bmu d(JsonReader jsonReader, bjj bjj) {
        return new bmu(bor.a(jsonReader, bjj, bpg.a(), boy.a));
    }

    static bml e(JsonReader jsonReader, bjj bjj) {
        return new bml(boh.a(jsonReader, bjj, bok.a));
    }

    static bmn a(JsonReader jsonReader, bjj bjj, int i) {
        return new bmn(boh.a(jsonReader, bjj, new boo(i)));
    }

    public static List a(JsonReader jsonReader, bjj bjj, box box) {
        return bor.a(jsonReader, bjj, 1.0f, box);
    }
}
