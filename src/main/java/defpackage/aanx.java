package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: aanx */
public final class aanx {
    private final aoex a;
    private List b;

    public aanx(aoex aoex) {
        this.a = (aoex) amqw.a((Object) aoex);
    }

    public static aanx a(String str, aanu aanu) {
        return new aanx(xvd.a(str), (aanu) amqw.a((Object) aanu));
    }

    private aanx(String str, aanu aanu) {
        this.a = null;
        aoes aoes = (aoes) aoet.d.createBuilder();
        arml a = ajqy.a(str);
        aoes.copyOnWrite();
        aoet aoet = (aoet) aoes.instance;
        if (a != null) {
            aoet.b = a;
            aoet.a |= 1;
            aoet aoet2 = (aoet) ((anxl) aoes.build());
            this.b = new ArrayList(2);
            this.b.add(aoet2);
            this.b.add(aanu);
            return;
        }
        throw new NullPointerException();
    }

    public final List a() {
        if (this.b == null) {
            this.b = new ArrayList(this.a.b.size() + 1);
            aoev aoev = this.a.c;
            if (aoev == null) {
                aoev = aoev.c;
            }
            if ((aoev.a & 1) != 0) {
                List list = this.b;
                aoev aoev2 = this.a.c;
                if (aoev2 == null) {
                    aoev2 = aoev.c;
                }
                Object obj = aoev2.b;
                if (obj == null) {
                    obj = aoet.d;
                }
                list.add(obj);
            }
            for (aoew aoew : this.a.b) {
                if (aoew.a == 62381864) {
                    this.b.add(new aanv((aoer) aoew.b));
                }
            }
            if (this.b == null) {
                this.b = Collections.emptyList();
            }
        }
        return this.b;
    }

    public final aanu b() {
        for (Object next : a()) {
            if (next instanceof aanu) {
                aanu aanu = (aanu) next;
                if (!aanu.a()) {
                    return aanu;
                }
            }
        }
        return null;
    }
}
