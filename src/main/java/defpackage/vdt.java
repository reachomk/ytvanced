package defpackage;

import android.text.TextUtils;
import java.util.Set;

/* renamed from: vdt */
public final class vdt implements vlp, vlx {
    public final bcaa a;
    public final vmd b = new vmd();
    public String c = "";
    private final bcaa d;
    private final Set e;

    public vdt(bcaa bcaa, bcaa bcaa2, Set set, bctz bctz) {
        this.d = (bcaa) amqw.a((Object) bcaa);
        this.a = (bcaa) amqw.a((Object) bcaa2);
        this.e = (Set) amqw.a((Object) set);
        bctz.c().a(new vds(this));
    }

    /* Access modifiers changed, original: final */
    public final void a(vrt vrt) {
        try {
            vmd vmd = this.b;
            String str;
            String valueOf;
            if (vmd.a.containsKey(vrt.a)) {
                vte vte = vmd.c;
                if (vte != null) {
                    str = "UiSlot is already occupied by: ";
                    valueOf = String.valueOf(vte.a());
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    throw new vmg(valueOf);
                }
                vmd.c = (vte) vmd.a.get(vrt.a);
                ((vls) this.d.get()).c(vrt);
                vrq vrq = (vrq) this.b.b(vrt);
                if (vrq != null) {
                    a(vrt, vrq);
                }
                return;
            }
            valueOf = "SlotId: ";
            str = String.valueOf(vrt.a);
            if (str.length() == 0) {
                str = new String(valueOf);
            } else {
                str = valueOf.concat(str);
            }
            throw new vmi(str);
        } catch (vmg | vmi e) {
            ((vls) this.d.get()).b(vrt, new vmb(e.toString()));
        }
    }

    private final void c(vrt vrt) {
        try {
            vmd vmd = this.b;
            String str;
            if (vmd.a.containsKey(vrt.a)) {
                vte vte = vmd.c;
                if (vte == null || !TextUtils.equals(vte.a(), vrt.a)) {
                    str = vrt.a;
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 30);
                    stringBuilder.append("Slot: ");
                    stringBuilder.append(str);
                    stringBuilder.append(" is not the active slot.");
                    throw new vmh(stringBuilder.toString());
                }
                vmd.c = null;
                ((vls) this.d.get()).b(vrt);
                return;
            }
            str = "SlotId: ";
            String valueOf = String.valueOf(vrt.a);
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new vmi(valueOf);
        } catch (vmh | vmi e) {
            ((vls) this.d.get()).a((vss) vrt, new vmb(e.toString()));
        }
    }

    private final void a(vrt vrt, vrq vrq) {
        try {
            vmd vmd = this.b;
            String str;
            String valueOf;
            if (vmd.a.containsKey(vrt.a)) {
                vte vte = vmd.c;
                if (vte != null) {
                    if (TextUtils.equals(vte.a(), vrt.a)) {
                        vsj vsj = vmd.d;
                        if (vsj != null) {
                            str = "UiSlot's layout is already occupied by: ";
                            valueOf = String.valueOf(vsj.a());
                            throw new vmf(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                        }
                        vmd.d = vrq;
                        for (vlw a : this.e) {
                            if (a.a(vrq, new vdv(this, vrt, vrq))) {
                                return;
                            }
                        }
                        vlr vlr = (vlr) this.a.get();
                        str = String.valueOf(vrq.getClass());
                        StringBuilder stringBuilder = new StringBuilder(str.length() + 59);
                        stringBuilder.append("No BelowPlayerRenderingHandler registered for layout type: ");
                        stringBuilder.append(str);
                        vlr.a((vss) vrt, (vsj) vrq, new vly(stringBuilder.toString()));
                        return;
                    }
                }
                valueOf = "Cannot activate layout since the slot is not active: ";
                str = String.valueOf(vrt.a);
                throw new vmh(str.length() == 0 ? new String(valueOf) : valueOf.concat(str));
            }
            valueOf = "SlotId: ";
            str = String.valueOf(vrt.a);
            throw new vmi(str.length() == 0 ? new String(valueOf) : valueOf.concat(str));
        } catch (vmf | vmh | vmi e) {
            ((vlr) this.a.get()).a((vss) vrt, (vsj) vrq, new vly(e.toString()));
        }
    }

    public final boolean b(vrt vrt) {
        return !this.c.isEmpty() && TextUtils.equals(vrt.b, this.c);
    }

    private final boolean d(vrt vrt) {
        vte vte = this.b.c;
        return vte != null && TextUtils.equals(((vrt) vte).a, vrt.a);
    }
}
