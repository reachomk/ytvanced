package defpackage;

import android.app.Activity;
import com.google.android.youtube.R;

/* renamed from: hia */
public final class hia implements ahcq, xcp {
    public avsj a;
    public aphg b;
    public String c = null;
    private final Activity d;
    private final hic e;

    public hia(Activity activity, hic hic) {
        this.d = activity;
        this.e = hic;
    }

    public final void a(avsj avsj) {
        this.a = avsj;
        this.b = null;
    }

    private final void b(agqy agqy) {
        avsj avsj = this.a;
        if (avsj != null) {
            this.e.a(agqy, avsj);
        } else {
            this.e.a(agqy);
        }
    }

    public final void a(String str, int i) {
        if (str.equals(this.c) && i == 0) {
            this.e.aC_();
        }
    }

    static boolean a(agqy agqy) {
        boolean z = false;
        if (agqy != null) {
            if (agqy.u() == agqs.PLAYABLE || agqy.j()) {
                z = true;
            } else if (agqy.l()) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        agqy agqy;
        if (i == -1) {
            clsArr = new Class[]{aglk.class, aglj.class, aglm.class, agll.class, agls.class};
        } else if (i == 0) {
            agqy = ((aglk) obj).a;
            if (agqy.a().equals(this.c)) {
                b(agqy);
                return null;
            }
        } else if (i == 1) {
            aglj aglj = (aglj) obj;
            if (aglj.a.equals(this.c)) {
                b(null);
                if (aglj.b == 0) {
                    xpr.a(this.d, (int) R.string.offline_error_no_external_storage, 1);
                } else {
                    xpr.a(this.d, (int) R.string.add_video_to_offline_error, 1);
                }
            }
        } else if (i == 2) {
            agqy = ((aglm) obj).a;
            if (agqy.a().equals(this.c)) {
                b(agqy);
                xpr.a(this.d, (int) R.string.add_to_offline_done, 1);
                return null;
            }
        } else if (i != 3) {
            if (i == 4) {
                agqy agqy2 = ((agls) obj).a;
                if (agqy2.a().equals(this.c)) {
                    b(agqy2);
                    if (agqy2.v()) {
                        if (agqy2.s()) {
                            xpr.a(this.d, (int) R.string.cannot_watch_offline, 1);
                        } else if (agqy2.t()) {
                            if (!agqy2.j.c()) {
                                xpr.a(this.d, (int) R.string.cannot_watch_offline, 1);
                                return null;
                            }
                        } else if (agqy2.l != agqf.NO_STORAGE_ERROR) {
                            xpr.a(this.d, (int) R.string.add_video_to_offline_error, 1);
                        } else {
                            xpr.a(this.d, (int) R.string.add_to_offline_not_enough_space, 1);
                        }
                    }
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (((agll) obj).a.equals(this.c)) {
            b(null);
            return null;
        }
        return clsArr;
    }
}
