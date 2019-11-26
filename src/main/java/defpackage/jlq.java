package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;

/* renamed from: jlq */
public final class jlq implements xcp {
    private TextView A;
    private TextView B;
    private TextView C;
    private boolean D;
    public final Activity a;
    public final View b;
    public final acvx c;
    public SwitchCompat d;
    public TextView e;
    public View f;
    public TextView g;
    public TextView h;
    public TextView i;
    public fnb j;
    public TextView k;
    public fnb l;
    public AlertDialog m;
    public boolean n;
    public akpk o;
    public awkb p;
    private final aaas q;
    private final akpe r;
    private final String s;
    private final fna t;
    private final akkq u;
    private final float v = 1.0f;
    private final float w;
    private RecyclerView x;
    private View y;
    private View z;

    public jlq(Activity activity, aaas aaas, akpe akpe, String str, View view, fna fna, akkq akkq, acvx acvx) {
        this.a = (Activity) amqw.a((Object) activity);
        this.q = (aaas) amqw.a((Object) aaas);
        this.r = (akpe) amqw.a((Object) akpe);
        this.s = (String) amqw.a((Object) str);
        this.b = (View) amqw.a((Object) view);
        this.u = (akkq) amqw.a((Object) akkq);
        this.c = (acvx) amqw.a((Object) acvx);
        this.t = (fna) amqw.a((Object) fna);
        TypedValue typedValue = new TypedValue();
        this.b.getContext().getTheme().resolveAttribute(16842803, typedValue, true);
        this.w = typedValue.getFloat();
    }

    private final void a(abgf abgf) {
        if (TextUtils.equals(this.s, abgf.a)) {
            a();
            if (!abgf.c || this.p == null) {
                a(2);
            } else {
                this.A.setText(abgf.b);
                awjz awjz = this.p.l;
                if (awjz == null) {
                    awjz = awjz.c;
                }
                aphg aphg = awjz.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                anxp anxp = aphg.m;
                if (anxp == null) {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    Object obj;
                    access$000 = anxl.checkIsLite(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint);
                    anxp.a(access$000);
                    Object b = anxp.h.b(access$000.d);
                    if (b == null) {
                        obj = access$000.b;
                    } else {
                        obj = access$000.a(b);
                    }
                    axhr axhr = (axhr) ((anxo) ((SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) obj).toBuilder());
                    String str = abgf.b;
                    axhr.copyOnWrite();
                    SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) axhr.instance;
                    if (str != null) {
                        sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a = 2 | sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.a;
                        sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.b = str;
                        SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2 = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) ((anxl) axhr.build());
                        awjz awjz2 = this.p.l;
                        if (awjz2 == null) {
                            awjz2 = awjz.c;
                        }
                        anxl anxl = awjz2.b;
                        if (anxl == null) {
                            anxl = aphg.s;
                        }
                        aphf aphf = (aphf) ((anxo) anxl.toBuilder());
                        apxx apxx = (apxx) ((anxo) anxp.toBuilder());
                        apxx.a(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2);
                        aphf.b(apxx);
                        aphg aphg2 = (aphg) ((anxl) aphf.build());
                        awka awka = (awka) ((anxo) this.p.toBuilder());
                        anxl = this.p.l;
                        if (anxl == null) {
                            anxl = awjz.c;
                        }
                        awjy awjy = (awjy) ((anxo) anxl.toBuilder());
                        awjy.copyOnWrite();
                        awjz awjz3 = (awjz) awjy.instance;
                        if (aphg2 != null) {
                            awjz3.b = aphg2;
                            awjz3.a |= 1;
                            awka.copyOnWrite();
                            awkb awkb = (awkb) awka.instance;
                            awkb.l = (awjz) ((anxl) awjy.build());
                            awkb.a |= 1024;
                            this.p = (awkb) ((anxl) awka.build());
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    throw new NullPointerException();
                }
            }
        }
    }

    public final void a() {
        if (!this.D) {
            this.d = (SwitchCompat) this.b.findViewById(R.id.collaboration_state_switch);
            this.e = (TextView) this.b.findViewById(R.id.empty_collaborators_text);
            this.f = this.b.findViewById(R.id.collaborators_list);
            this.x = (RecyclerView) this.b.findViewById(R.id.collaborators_avatars);
            apn ans = new ans();
            ans.b(0);
            this.x.a(ans);
            aknw aknw = new aknw();
            aknw.a(awjt.class, new kgj(this.a, this.u, this.q));
            apa a = this.r.a(aknw);
            this.o = new akpk();
            a.a(this.o);
            this.x.a(a);
            this.y = this.b.findViewById(R.id.get_link_section);
            this.g = (TextView) this.b.findViewById(R.id.get_link_description);
            this.h = (TextView) this.b.findViewById(R.id.get_link_button);
            this.z = this.b.findViewById(R.id.link_sharing_section);
            this.A = (TextView) this.b.findViewById(R.id.invite_link);
            this.i = (TextView) this.b.findViewById(R.id.share_link_description);
            this.B = (TextView) this.b.findViewById(R.id.share_link_button);
            this.j = this.t.a(this.B);
            this.k = (TextView) this.b.findViewById(R.id.revoke_links_description);
            this.C = (TextView) this.b.findViewById(R.id.revoke_links_button);
            this.l = this.t.a(this.C);
            this.D = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0120  */
    public final void a(boolean r8) {
        /*
        r7 = this;
        r0 = r7.p;
        if (r0 == 0) goto L_0x0136;
    L_0x0004:
        r0 = r0.c;
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = defpackage.awjv.f;
    L_0x000a:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r0 = defpackage.apxu.d;
    L_0x0010:
        r1 = com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint;
        r1 = defpackage.anxl.checkIsLite(r1);
        r0.a(r1);
        r0 = r0.h;
        r2 = r1.d;
        r0 = r0.b(r2);
        if (r0 != 0) goto L_0x0026;
    L_0x0023:
        r0 = r1.b;
        goto L_0x002a;
    L_0x0026:
        r0 = r1.a(r0);
    L_0x002a:
        r0 = (com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) r0;
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.awhq) r0;
        r1 = 0;
        r2 = 0;
    L_0x0036:
        r3 = r0.instance;
        r3 = (com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) r3;
        r3 = r3.c;
        r3 = r3.size();
        if (r2 < r3) goto L_0x0043;
    L_0x0042:
        goto L_0x009d;
    L_0x0043:
        r3 = r0.instance;
        r3 = (com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) r3;
        r3 = r3.c;
        r3 = r3.get(r2);
        r3 = (defpackage.awhn) r3;
        r4 = r3.b;
        r4 = defpackage.awhp.a(r4);
        if (r4 != 0) goto L_0x0059;
    L_0x0057:
        goto L_0x0132;
    L_0x0059:
        r5 = 32;
        if (r4 != r5) goto L_0x0132;
    L_0x005d:
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.awhm) r3;
        r3.copyOnWrite();
        r4 = r3.instance;
        r4 = (defpackage.awhn) r4;
        r5 = r4.a;
        r6 = 2097152; // 0x200000 float:2.938736E-39 double:1.0361308E-317;
        r5 = r5 | r6;
        r4.a = r5;
        r8 = r8 ^ 1;
        r4.k = r8;
        r8 = r3.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.awhn) r8;
        r0.copyOnWrite();
        r3 = r0.instance;
        r3 = (com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) r3;
        if (r8 == 0) goto L_0x012c;
    L_0x0088:
        r4 = r3.c;
        r4 = r4.a();
        if (r4 != 0) goto L_0x0098;
    L_0x0090:
        r4 = r3.c;
        r4 = defpackage.anxl.mutableCopy(r4);
        r3.c = r4;
    L_0x0098:
        r3 = r3.c;
        r3.set(r2, r8);
    L_0x009d:
        r8 = r7.p;
        r8 = r8.toBuilder();
        r8 = (defpackage.anxo) r8;
        r8 = (defpackage.awka) r8;
        r2 = r7.p;
        r2 = r2.c;
        if (r2 != 0) goto L_0x00af;
    L_0x00ad:
        r2 = defpackage.awjv.f;
    L_0x00af:
        r2 = r2.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.awju) r2;
        r3 = r7.p;
        r3 = r3.c;
        if (r3 != 0) goto L_0x00bf;
    L_0x00bd:
        r3 = defpackage.awjv.f;
    L_0x00bf:
        r3 = r3.e;
        if (r3 != 0) goto L_0x00c5;
    L_0x00c3:
        r3 = defpackage.apxu.d;
    L_0x00c5:
        r3 = r3.toBuilder();
        r3 = (defpackage.anxo) r3;
        r3 = (defpackage.apxx) r3;
        r4 = com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint;
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) r0;
        r3.a(r4, r0);
        r2.copyOnWrite();
        r0 = r2.instance;
        r0 = (defpackage.awjv) r0;
        r3 = r3.build();
        r3 = (defpackage.anxl) r3;
        r3 = (defpackage.apxu) r3;
        r0.e = r3;
        r3 = r0.a;
        r3 = r3 | 8;
        r0.a = r3;
        r8.copyOnWrite();
        r0 = r8.instance;
        r0 = (defpackage.awkb) r0;
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.awjv) r2;
        r0.c = r2;
        r2 = r0.a;
        r2 = r2 | 2;
        r0.a = r2;
        r8 = r8.build();
        r8 = (defpackage.anxl) r8;
        r8 = (defpackage.awkb) r8;
        r7.p = r8;
        r8 = r7.q;
        r0 = r7.p;
        r0 = r0.c;
        if (r0 != 0) goto L_0x011c;
    L_0x011a:
        r0 = defpackage.awjv.f;
    L_0x011c:
        r0 = r0.e;
        if (r0 != 0) goto L_0x0122;
    L_0x0120:
        r0 = defpackage.apxu.d;
    L_0x0122:
        r2 = 0;
        r8.a(r0, r2);
        r8 = r7.d;
        r8.setEnabled(r1);
        return;
    L_0x012c:
        r8 = new java.lang.NullPointerException;
        r8.<init>();
        throw r8;
    L_0x0132:
        r2 = r2 + 1;
        goto L_0x0036;
    L_0x0136:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlq.a(boolean):void");
    }

    public final void a(int i) {
        if (i == 1) {
            this.z.setVisibility(8);
            this.y.setVisibility(0);
            this.e.setVisibility(0);
            this.f.setVisibility(8);
            this.o.clear();
            b(false);
        } else if (i != 2) {
            this.y.setVisibility(8);
            this.z.setVisibility(0);
            b(true);
        } else {
            this.z.setVisibility(8);
            this.y.setVisibility(0);
            b(true);
        }
    }

    public final void b(boolean z) {
        float f;
        this.h.setEnabled(z);
        if (z) {
            f = this.v;
        } else {
            f = this.w;
        }
        this.y.setAlpha(f);
        this.e.setAlpha(f);
    }

    public final void b() {
        if (this.p != null) {
            apxu apxu;
            a(3);
            this.A.setText(this.a.getString(R.string.collab_playlist_link_loading));
            aaas aaas = this.q;
            awjz awjz = this.p.j;
            if (awjz == null) {
                awjz = awjz.c;
            }
            aphg aphg = awjz.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            if ((aphg.a & 2048) == 0) {
                apxu = null;
            } else {
                awjz = this.p.j;
                if (awjz == null) {
                    awjz = awjz.c;
                }
                aphg = awjz.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            aaas.a(apxu, null);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{abgf.class, abge.class, abgl.class};
        } else if (i == 0) {
            a((abgf) obj);
        } else if (i == 1) {
            abge abge = (abge) obj;
            if (TextUtils.equals(this.s, abge.a)) {
                a();
                if (abge.c) {
                    int i2 = abge.b ^ 1;
                    this.n = i2;
                    if (i2 != 0) {
                        b();
                    }
                } else {
                    this.d.setChecked(this.n);
                    b(this.n);
                }
                this.d.setEnabled(true);
            }
        } else if (i == 2) {
            abgl abgl = (abgl) obj;
            if (TextUtils.equals(this.s, abgl.a)) {
                a();
                if (!abgl.b) {
                    a(3);
                    return null;
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
