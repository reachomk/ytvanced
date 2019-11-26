package defpackage;

import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: bclf */
public final class bclf extends bcji {
    private final bclr a;
    private final String b;
    private final bcix c;
    private final Executor d;
    private final ArrayList e = new ArrayList();
    private String f = "POST";
    private final int g = 3;
    private boolean h;
    private Collection i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;

    public bclf(String str, bcix bcix, Executor executor, bclr bclr) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (executor != null) {
            this.b = str;
            this.c = bcix;
            this.d = executor;
            this.a = bclr;
        } else {
            throw new NullPointerException("Executor is required.");
        }
    }

    public final bcji a(Object obj) {
        if (obj != null) {
            if (this.i == null) {
                this.i = new ArrayList();
            }
            this.i.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }

    public final /* synthetic */ bciw b() {
        return this.a.a(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public final /* bridge */ /* synthetic */ bciy a() {
        this.h = true;
        return this;
    }

    public final /* synthetic */ bciy a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 != null) {
            this.e.add(new SimpleImmutableEntry(str, str2));
            return this;
        } else {
            throw new NullPointerException("Invalid header value.");
        }
    }
}
