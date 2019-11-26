package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.Spanned;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: xwv */
public final class xwv implements zdw, zdz {
    public final Context a;
    public final aaas b;
    public final zea c;
    public final zav d;
    public final Uri e = zdd.a;
    public auvn f;
    public aqjm g;
    public xww h;
    public aqjk i;
    public zeg j;
    public List k;
    public Uri l;
    public Object m;
    private final aarh n;
    private final akmx o;
    private final xoi p;
    private final zeb q;
    private final acwa r;
    private final afve s;
    private final ArrayAdapter t;
    private final yeb u;
    private final alpa v;
    private final int w;

    public xwv(Context context, aaas aaas, aarh aarh, akmx akmx, xoi xoi, zeb zeb, zea zea, acwa acwa, afve afve, zav zav, ArrayAdapter arrayAdapter, yeb yeb, alpa alpa, int i) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.n = (aarh) amqw.a((Object) aarh);
        this.o = (akmx) amqw.a((Object) akmx);
        this.p = (xoi) amqw.a((Object) xoi);
        this.q = (zeb) amqw.a((Object) zeb);
        this.c = (zea) amqw.a((Object) zea);
        this.r = (acwa) amqw.a((Object) acwa);
        this.s = (afve) amqw.a((Object) afve);
        this.d = (zav) amqw.a((Object) zav);
        this.t = (ArrayAdapter) amqw.a((Object) arrayAdapter);
        this.u = (yeb) amqw.a((Object) yeb);
        this.v = (alpa) amqw.a((Object) alpa);
        this.w = i;
    }

    public final void a(auvn auvn, Object obj) {
        this.f = (auvn) amqw.a((Object) auvn);
        this.m = obj;
        a();
    }

    public final void a(List list) {
        for (zdy zdy : list) {
            Uri a = zdy.a();
            if (a.equals(this.l)) {
                this.g = xwv.a(zdy.c());
                if (this.g == null) {
                    xtl.d(String.format("Path %s is not a contact.", new Object[]{this.l}));
                }
            } else if (a.equals(this.e)) {
                this.i = xwv.b(zdy.c());
                if (this.i == null) {
                    xtl.d(String.format("Path %s is not a config.", new Object[]{this.e}));
                }
            }
        }
        c();
    }

    public final void a(zdt zdt) {
        b();
        if (zdt.a || this.g == null || this.i == null) {
            this.d.W();
            this.p.a(this.a.getResources().getString(R.string.short_error_message));
            return;
        }
        c();
    }

    public final void a() {
        auvn auvn = this.f;
        if (auvn != null) {
            auvx auvx = auvn.c;
            if (auvx == null) {
                auvx = auvx.c;
            }
            aygk aygk = null;
            yeb yeb;
            auvx auvx2;
            arml arml;
            if (auvx.a != 82258301) {
                auvx = this.f.c;
                if (auvx == null) {
                    auvx = auvx.c;
                }
                if (auvx.a != 94310230) {
                    this.u.a.setVisibility(8);
                } else {
                    this.u.a.setVisibility(0);
                    yeb = this.u;
                    auvx2 = this.f.c;
                    if (auvx2 == null) {
                        auvx2 = auvx.c;
                    }
                    arml = (auvx2.a == 94310230 ? (aqid) auvx2.b : aqid.e).b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    Spanned a = ajqy.a(arml);
                    auvx auvx3 = this.f.c;
                    if (auvx3 == null) {
                        auvx3 = auvx.c;
                    }
                    arml arml2 = (auvx3.a == 94310230 ? (aqid) auvx3.b : aqid.e).c;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                    Spanned a2 = ajqy.a(arml2);
                    auvx auvx4 = this.f.c;
                    if (auvx4 == null) {
                        auvx4 = auvx.c;
                    }
                    if (((auvx4.a == 94310230 ? (aqid) auvx4.b : aqid.e).a & 4) != 0) {
                        aqid aqid;
                        auvx auvx5 = this.f.c;
                        if (auvx5 == null) {
                            auvx5 = auvx.c;
                        }
                        if (auvx5.a == 94310230) {
                            aqid = (aqid) auvx5.b;
                        } else {
                            aqid = aqid.e;
                        }
                        aygk = aqid.d;
                        if (aygk == null) {
                            aygk = aygk.f;
                        }
                    }
                    yeb.a(a, a2, aygk);
                }
            } else {
                this.u.a.setVisibility(0);
                yeb = this.u;
                auvx2 = this.f.c;
                if (auvx2 == null) {
                    auvx2 = auvx.c;
                }
                if (((auvx2.a == 82258301 ? (auvv) auvx2.b : auvv.e).a & 1) == 0) {
                    arml = null;
                } else {
                    auvv auvv;
                    auvx2 = this.f.c;
                    if (auvx2 == null) {
                        auvx2 = auvx.c;
                    }
                    if (auvx2.a == 82258301) {
                        auvv = (auvv) auvx2.b;
                    } else {
                        auvv = auvv.e;
                    }
                    arml = auvv.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                yeb.a(ajqy.a(arml), null, null);
            }
            this.t.clear();
            for (auvj auvj : this.f.b) {
                ufk ufk = new ufk(abmk.a(auvj).toString());
                ufk.a(this.w);
                if (abmk.b(auvj) != null) {
                    alpa alpa = this.v;
                    arwh a3 = arwh.a(abmk.b(auvj).b);
                    if (a3 == null) {
                        a3 = arwh.UNKNOWN;
                    }
                    int a4 = alpa.a(a3);
                    if (a4 != 0) {
                        ufk.d = this.a.getResources().getDrawable(a4);
                    }
                }
                this.t.add(ufk);
            }
            this.d.X();
        }
    }

    public final void b() {
        this.g = xwv.a(this.q.a(this.l));
        this.i = xwv.b(this.q.a(this.e));
    }

    public final void c() {
        aqjm aqjm = this.g;
        if (aqjm != null && this.i != null) {
            yeb yeb = this.u;
            arml arml = aqjm.c;
            if (arml == null) {
                arml = arml.f;
            }
            Spanned a = ajqy.a(arml);
            aygk aygk = this.g.d;
            if (aygk == null) {
                aygk = aygk.f;
            }
            yeb.a(a, null, aygk);
            boolean z = (this.g.a & 4096) != 0;
            this.t.clear();
            aqkr a2 = aqkr.a(this.g.e);
            if (a2 == null) {
                a2 = aqkr.CONTACT_STATE_UNKNOWN;
            }
            switch (a2.ordinal()) {
                case 1:
                    a(this.i, z, xwx.CHAT_ITEM, xwx.CHANNEL_ITEM, xwx.REMOVE_CONTACT_ITEM, xwx.BLOCK_ITEM);
                    break;
                case 2:
                    a(this.i, z, xwx.CHANNEL_ITEM, xwx.INVITE_ITEM, xwx.BLOCK_ITEM);
                    break;
                case 3:
                    a(this.i, z, xwx.CHANNEL_ITEM, xwx.REINVITE_ITEM, xwx.CANCEL_INVITE_ITEM);
                    break;
                case 4:
                case 7:
                    a(this.i, z, xwx.CHANNEL_ITEM, xwx.ACCEPT_INVITE_ITEM, xwx.BLOCK_ITEM);
                    break;
                case 5:
                    a(this.i, z, xwx.CHANNEL_ITEM, xwx.UNBLOCK_ITEM);
                    break;
                case 6:
                    a(this.i, z, xwx.CHANNEL_ITEM);
                    break;
                default:
                    xtl.d("Unknown contact state");
                    break;
            }
            this.d.X();
        }
    }

    private final void a(aqjk aqjk, boolean z, xwx... xwxArr) {
        xwx[] xwxArr2 = xwxArr;
        this.k = new ArrayList();
        for (xwx xwx : xwxArr2) {
            if (z || xwx != xwx.CHANNEL_ITEM) {
                auuz a = xwx.a(aqjk);
                if (a != null) {
                    String obj;
                    int i = a.b;
                    if (i == 4) {
                        HashMap hashMap = new HashMap();
                        arml arml = this.g.c;
                        if (arml == null) {
                            arml = arml.f;
                        }
                        hashMap.put("user_name", ajqy.a(arml).toString());
                        aktd aktd = new aktd(a.b == 4 ? (armr) a.c : armr.d);
                        if (!(aktd.a == null || aktd.b.isEmpty() || aktd.a.c.size() == 0 || aktd.b.size() != aktd.a.c.size())) {
                            arml = aktd.c;
                            if (!(arml == null || arml.b.size() == 0)) {
                                armp[] armpArr = (armp[]) aktd.c.b.toArray(new armp[0]);
                                for (int i2 = 0; i2 < aktd.b.size(); i2++) {
                                    int c = aktd.a.c.c(i2);
                                    if (c >= 0 && c < armpArr.length) {
                                        String str = (String) aktd.b.get(i2);
                                        armo armo = (armo) ((anxo) armpArr[c].toBuilder());
                                        if (hashMap.containsKey(str)) {
                                            armo.a((String) hashMap.get(str));
                                        }
                                        armpArr[c] = (armp) ((anxl) armo.build());
                                    }
                                }
                                armk armk = (armk) ((anxo) aktd.c.toBuilder());
                                armk.copyOnWrite();
                                ((arml) armk.instance).b = anxl.emptyProtobufList();
                                List asList = Arrays.asList(armpArr);
                                armk.copyOnWrite();
                                arml arml2 = (arml) armk.instance;
                                arml2.a();
                                anvf.addAll(asList, arml2.b);
                                aktd.c = (arml) ((anxl) armk.build());
                            }
                        }
                        obj = ajqy.a(aktd.c).toString();
                    } else {
                        arml arml3;
                        if (i != 1) {
                            arml3 = arml.f;
                        } else {
                            arml3 = (arml) a.c;
                        }
                        obj = ajqy.a(arml3).toString();
                    }
                    ufk ufk = new ufk(obj);
                    ufk.a(this.w);
                    if ((a.a & 4) != 0) {
                        alpa alpa = this.v;
                        arwf arwf = a.d;
                        if (arwf == null) {
                            arwf = arwf.c;
                        }
                        arwh a2 = arwh.a(arwf.b);
                        if (a2 == null) {
                            a2 = arwh.UNKNOWN;
                        }
                        int a3 = alpa.a(a2);
                        if (a3 != 0) {
                            ufk.d = this.a.getResources().getDrawable(a3);
                        }
                    }
                    this.k.add(xwx);
                    this.t.add(ufk);
                }
            } else {
                aqjk aqjk2 = aqjk;
            }
        }
        this.t.notifyDataSetChanged();
    }

    public final void a(xwx xwx, String str) {
        apxx apxx;
        apxu apxu;
        if (xwx.ordinal() != 8) {
            aras aras = (aras) EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.d.createBuilder();
            aras.copyOnWrite();
            EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint = (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) aras.instance;
            if (str != null) {
                editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.a |= 1;
                editConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.b = str;
                apxx = (apxx) apxu.d.createBuilder();
                apxx.a(EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint, (EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint) ((anxl) aras.build()));
                apxu = (apxu) ((anxl) apxx.build());
                alho alho = new alho(this.n, this.p, this.b, this.o, this.a, this.s);
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.m);
                    alho.a(apxu, hashMap);
                    return;
                } catch (aabf e) {
                    xtl.c(e.getLocalizedMessage());
                    return;
                }
            }
            throw new NullPointerException();
        }
        axfl axfl = (axfl) SendShareEndpoint$SendShareToContactsEndpoint.f.createBuilder();
        axfl.a(asfa.f);
        asev asev = (asev) ases.c.createBuilder();
        asev.a(str);
        axfl.a(asev);
        apxx = (apxx) apxu.d.createBuilder();
        apxx.a(SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint, (SendShareEndpoint$SendShareToContactsEndpoint) ((anxl) axfl.build()));
        apxu = (apxu) ((anxl) apxx.build());
        try {
            new alie(this.n, this.p, this.b, this.r, this.a, this.s).a(apxu, new HashMap());
        } catch (aabf e2) {
            xtl.c(e2.getLocalizedMessage());
        }
    }

    private static aqjm a(Object obj) {
        if (obj instanceof aqta) {
            aqta aqta = (aqta) obj;
            anxr access$000 = anxl.checkIsLite(aqjm.p);
            aqta.a(access$000);
            if (aqta.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(aqjm.p);
                aqta.a(access$000);
                obj = aqta.h.b(access$000.d);
                if (obj == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(obj);
                }
                return (aqjm) obj;
            }
        }
        return null;
    }

    private static aqjk b(Object obj) {
        if (obj instanceof aqta) {
            aqta aqta = (aqta) obj;
            anxr access$000 = anxl.checkIsLite(aqjk.l);
            aqta.a(access$000);
            if (aqta.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(aqjk.l);
                aqta.a(access$000);
                obj = aqta.h.b(access$000.d);
                if (obj == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(obj);
                }
                return (aqjk) obj;
            }
        }
        return null;
    }
}
