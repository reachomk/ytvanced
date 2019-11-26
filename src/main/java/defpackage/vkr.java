package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: vkr */
public final class vkr implements vkk, vld {
    public final vla a;
    private final vkn b;
    private final List c = new ArrayList();
    private vru d;

    public vkr(vla vla, vkn vkn) {
        this.a = vla;
        this.b = vkn;
    }

    public final void a() {
        this.a.d();
    }

    public final void b() {
        throw new vlf();
    }

    public final void a(vsq vsq) {
        if (this.d != null) {
            throw new vlf();
        } else if (vsq instanceof vru) {
            this.d = (vru) vsq;
            int i = 0;
            for (vso vso : this.d.b) {
                this.c.add(new vkq(vso, i ^ 1));
                i |= vso.W();
            }
            this.a.a(c());
        } else {
            throw new vlf();
        }
    }

    private final List c() {
        ArrayList arrayList = new ArrayList(this.c.size());
        for (vkq vkq : this.c) {
            int i = vkq.c;
            if (i == 0) {
                arrayList.add(vtg.a);
                break;
            }
            if (i != 1) {
                if (i == 4 && vkq.b == 4) {
                    break;
                }
            }
            vkq.c = 2;
            arrayList.add(vkq.a);
        }
        return arrayList;
    }

    public final void a(vst vst, List list, int i) {
        vkn vkn;
        if (this.d != null) {
            List c = c();
            vsq vsq = null;
            vkn vkn2;
            if (c.size() < list.size()) {
                if (c.size() == list.size() - 1 && i == c.size() && (list.get(i) instanceof vtg)) {
                    try {
                        this.a.a(c);
                        return;
                    } catch (vlf e) {
                        vkn = this.b;
                        if (i < list.size()) {
                            vsq = (vsq) list.get(i);
                        }
                        vkn.a(vst, vsq, new vly(e.toString()));
                        return;
                    }
                }
                vkn2 = this.b;
                if (i < list.size()) {
                    vsq = (vsq) list.get(i);
                }
                vkn2.a(vst, vsq, new vly("Unable to determine next ad to play: Size regression"));
            } else if (c.size() < i - 1) {
                vkn2 = this.b;
                if (i < list.size()) {
                    vsq = (vsq) list.get(i);
                }
                vkn2.a(vst, vsq, new vly("Unable to determine next ad to play: Index out of bounds"));
            } else {
                int i2 = 0;
                while (i2 < list.size()) {
                    if (amqq.a(list.get(i2), c.get(i2)) || (list.get(i2) instanceof vtg)) {
                        i2++;
                    } else {
                        vkn2 = this.b;
                        if (i < list.size()) {
                            vsq = (vsq) list.get(i);
                        }
                        vkn2.a(vst, vsq, new vly("Unable to determine next ad to play: inconsistency in known ads"));
                        return;
                    }
                }
                if (c.get(i) instanceof vtg) {
                    vkn2 = this.b;
                    if (i < list.size()) {
                        vsq = (vsq) list.get(i);
                    }
                    vkn2.a(vst, vsq, new vly("Still unsure what ad to play next"));
                    return;
                }
                try {
                    this.a.a(c);
                } catch (vlf e2) {
                    vkn = this.b;
                    if (i < list.size()) {
                        vsq = (vsq) list.get(i);
                    }
                    vkn.a(vst, vsq, new vly(e2.toString()));
                }
            }
        }
    }

    public final void a(vst vst) {
        this.b.a(vst);
    }

    public final void b(vst vst) {
        this.b.b(vst);
    }

    public final void a(vst vst, vmb vmb) {
        this.b.a(vst, vmb);
    }

    public final void a(vst vst, vso vso) {
        for (vkq vkq : this.c) {
            if (TextUtils.equals(vso.j, vkq.a.j)) {
                if (vkq.c == 2) {
                    vkq.c = 3;
                    this.b.a(vst, vso);
                    return;
                }
                this.b.a(vst, (vsq) vso, new vly("Inconsistency in renderingStatus for ad"));
                return;
            }
        }
        this.b.a(vst, (vsq) vso, new vly("Unrecognized ad"));
    }

    public final void a(vst vst, vso vso, vlq vlq) {
        this.b.a(vst, vso, vlq);
    }

    public final void a(vst vst, vso vso, vlt vlt) {
        int i = 0;
        while (i < this.c.size()) {
            vkq vkq = (vkq) this.c.get(i);
            if (!TextUtils.equals(vso.j, vkq.a.j)) {
                i++;
            } else if (vkq.c == 3) {
                vkq.c = 4;
                int i2 = vlt.a;
                vkq.b = i2;
                if (i2 == 0) {
                    i++;
                    if (i < this.c.size()) {
                        vkq vkq2 = (vkq) this.c.get(i);
                        if (vkq2.c == 0) {
                            vkq2.c = 1;
                        }
                    }
                } else {
                    for (i++; i < this.c.size(); i++) {
                        vkq = (vkq) this.c.get(i);
                        vkq.c = 4;
                        vkq.b = 4;
                    }
                }
                this.b.a(vst, vso, vlt);
                return;
            } else {
                this.b.a(vst, (vsq) vso, new vly("Inconsistency in renderingStatus for ad"));
                return;
            }
        }
        this.b.a(vst, (vsq) vso, new vly("Unrecognized ad"));
    }

    public final void a(vst vst, vso vso, vly vly) {
        this.b.a(vst, (vsq) vso, vly);
    }
}
