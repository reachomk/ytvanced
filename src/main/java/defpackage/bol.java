package defpackage;

import android.util.JsonReader;

/* renamed from: bol */
public final class bol implements box {
    public static final bol a = new bol();

    private bol() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        return Float.valueOf(boq.b(jsonReader) * f);
    }
}
