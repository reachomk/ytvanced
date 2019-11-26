package defpackage;

import android.text.Spanned;
import android.view.View.OnClickListener;
import java.util.Map;

/* renamed from: jfn */
public final class jfn implements xcp {
    private final albi a;
    private final fdi b;
    private final fdg c;
    private final acwa d;
    private final zzl e;

    public jfn(albi albi, fdi fdi, fdg fdg, acwa acwa, zzl zzl) {
        this.a = albi;
        this.b = fdi;
        this.c = fdg;
        this.d = acwa;
        this.e = zzl;
    }

    private final void a(byte[] bArr, fdd fdd) {
        acvx t = this.d.t();
        if (!(bArr == null || bArr.length <= 0 || t == null)) {
            fdd.a(new jfq(t, bArr));
        }
        arvt b = this.e.b();
        int i = 0;
        if (b != null) {
            aume aume = b.e;
            if (aume == null) {
                aume = aume.af;
            }
            if (aume.O) {
                i = 1;
            }
        }
        fdd.b(i ^ 1);
        this.a.b((fde) fdd.d());
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{zye.class};
        } else if (i == 0) {
            zye zye = (zye) obj;
            avkh avkh = zye.b;
            avls avls = zye.a;
            Map map;
            fdd fdd;
            if (avkh != null) {
                arml arml;
                aphg aphg;
                byte[] d = avkh.d.d();
                fdg fdg = this.c;
                map = zye.c;
                fdd = (fdd) fdg.a.b();
                if ((avkh.a & 1) != 0) {
                    arml = avkh.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                } else {
                    arml = null;
                }
                fdd = (fdd) fdd.b(ajqy.a(arml));
                aphj aphj = avkh.c;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                if ((1 & aphj.a) == 0) {
                    aphg = null;
                } else {
                    aphj aphj2 = avkh.c;
                    if (aphj2 == null) {
                        aphj2 = aphj.d;
                    }
                    aphg = aphj2.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                }
                if (aphg != null) {
                    OnClickListener onClickListener;
                    if ((aphg.a & 128) != 0) {
                        arml = aphg.g;
                        if (arml == null) {
                            arml = arml.f;
                        }
                    } else {
                        arml = null;
                    }
                    Spanned a = ajqy.a(arml);
                    int i2 = aphg.a;
                    if ((i2 & 4096) == 0 && (i2 & 2048) == 0) {
                        onClickListener = null;
                    } else {
                        onClickListener = new fdf(fdg, map, avkh, aphg);
                    }
                    fdd.a(a, onClickListener);
                }
                a(d, fdd);
                return null;
            } else if (avls == null) {
                return null;
            } else {
                arml arml2;
                arml arml3;
                OnClickListener onClickListener2;
                byte[] d2 = avls.e.d();
                fdi fdi = this.b;
                map = zye.c;
                fdd = (fdd) fdi.a.b();
                if ((1 & avls.a) != 0) {
                    arml2 = avls.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                } else {
                    arml2 = null;
                }
                fdd fdd2 = (fdd) fdd.b(ajqy.a(arml2));
                if ((avls.a & 2) != 0) {
                    arml3 = avls.c;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                } else {
                    arml3 = null;
                }
                Spanned a2 = ajqy.a(arml3);
                if ((avls.a & 4) == 0) {
                    onClickListener2 = null;
                } else {
                    map = acwi.a(map);
                    String str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
                    if (map.containsKey(str)) {
                        map.put("feedback_undo", map.get(str));
                    }
                    map.put(str, avls);
                    onClickListener2 = new fdh(fdi, avls, map);
                }
                a(d2, (fdd) fdd2.a(a2, onClickListener2));
                return null;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
