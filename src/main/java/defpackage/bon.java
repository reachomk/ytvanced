package defpackage;

import android.util.JsonReader;

/* renamed from: bon */
public final class bon implements box {
    public static final bon a = new bon();

    private bon() {
    }

    public final /* synthetic */ Object a(JsonReader jsonReader, float f) {
        return Integer.valueOf(Math.round(boq.b(jsonReader) * f));
    }
}
