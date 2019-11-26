package com.facebook.litho;

import android.graphics.Rect;
import defpackage.cmi;
import java.util.Collections;
import java.util.List;

public class TestItem {
    public String a;
    public final Rect b = new Rect();
    public ComponentHost c;
    public Object d;
    private final AcquireKey e = new AcquireKey();

    public final class AcquireKey {
    }

    public String getTestKey() {
        return this.a;
    }

    public Rect getBounds() {
        return this.b;
    }

    public ComponentHost getHost() {
        return this.c;
    }

    public String getTextContent() {
        List textItems = cmi.a(Collections.singletonList(this.d)).getTextItems();
        StringBuilder stringBuilder = new StringBuilder();
        int size = textItems.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append((CharSequence) textItems.get(i));
        }
        return stringBuilder.toString();
    }

    public AcquireKey getAcquireKey() {
        return this.e;
    }
}
