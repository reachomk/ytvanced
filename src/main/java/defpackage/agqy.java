package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.youtube.R;

/* renamed from: agqy */
public final class agqy {
    public final agqp a;
    public final avsi b;
    public final int c;
    public final byte[] d;
    public final boolean e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final agqw j;
    public final atdv k;
    public final agqf l;
    public final agqq m;
    public final agqn n;
    public final agqz o;
    private final boolean p;

    public agqy(agqp agqp, avsi avsi, int i, byte[] bArr, boolean z, long j, long j2, long j3, long j4, agqw agqw, atdv atdv, agqf agqf, agqq agqq, agqn agqn, agqz agqz, boolean z2) {
        this.a = (agqp) amqw.a((Object) agqp);
        this.b = avsi;
        this.c = i;
        this.d = bArr;
        this.e = z;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = agqw;
        this.k = atdv;
        this.l = agqf;
        this.m = agqq;
        this.n = agqn;
        this.o = agqz;
        this.p = z2;
    }

    public final String a() {
        return this.a.a();
    }

    public final String a(Context context) {
        agqw agqw = this.j;
        if (agqw == null || !agqw.d()) {
            return this.a.b();
        }
        return context.getString(R.string.expired_video_title);
    }

    public final long b() {
        agqw agqw = this.j;
        if (agqw == null || !agqw.d()) {
            return this.a.e.n;
        }
        return 0;
    }

    public final String c() {
        agqw agqw = this.j;
        if (agqw == null || !agqw.d()) {
            return this.a.c();
        }
        return "";
    }

    public final agpy d() {
        agqw agqw = this.j;
        if (agqw == null || !agqw.d()) {
            return this.a.a;
        }
        return null;
    }

    public final aygk e() {
        agqw agqw = this.j;
        if (agqw == null || !agqw.d()) {
            return this.a.f();
        }
        return null;
    }

    public final Uri f() {
        agqw agqw = this.j;
        if (agqw != null && agqw.d()) {
            return null;
        }
        agqp agqp = this.a;
        aaft aaft = agqp.b;
        if (aaft == null || aaft.a.isEmpty()) {
            return null;
        }
        return agqp.b.a(240).a();
    }

    public final long g() {
        agqn agqn = this.n;
        if (agqn == null) {
            return 0;
        }
        return agqn.c;
    }

    public final long h() {
        agqn agqn = this.n;
        if (agqn == null) {
            return 0;
        }
        return agqn.d;
    }

    public final boolean i() {
        return this.l == agqf.METADATA_ONLY;
    }

    public final boolean j() {
        return this.l == agqf.ACTIVE;
    }

    public final boolean k() {
        if (j()) {
            agqz agqz = this.o;
            if (agqz != null && agqz.b == agrc.PENDING) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        return this.l == agqf.PAUSED;
    }

    private final boolean C() {
        if (this.p) {
            agqn agqn = this.n;
            if (agqn != null) {
                agql agql = agqn.b;
                agql agql2 = agqn.a;
                if (!(agql == null || !agql.u() || agql2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean D() {
        if (this.p) {
            agqn agqn = this.n;
            if (agqn != null && agqn.d >= 5242880) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        if (j()) {
            agqz agqz = this.o;
            if (agqz != null && agqz.b == agrc.RUNNING) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        return this.l == agqf.COMPLETE;
    }

    public final boolean o() {
        return this.l == agqf.STREAM_DOWNLOAD_PENDING;
    }

    public final boolean p() {
        return k() && (this.o.c & 256) != 0;
    }

    public final int q() {
        return h() > 0 ? (int) ((g() * 100) / h()) : 0;
    }

    public final boolean r() {
        atdv atdv = this.k;
        return (atdv == null || aiqr.a(atdv)) ? false : true;
    }

    public final boolean s() {
        return r() && aiqr.c(this.k);
    }

    public final boolean t() {
        agqw agqw = this.j;
        return (agqw == null || agqw.b == null || (agqw.b() && !agqw.c())) ? false : true;
    }

    public final agqs u() {
        int ordinal;
        if (v()) {
            if (o()) {
                return agqs.TRANSFER_PENDING_USER_APPROVAL;
            }
            if (s()) {
                return agqs.ERROR_PENDING_PLAYABILITY_ACTION;
            }
            if (r()) {
                return agqs.ERROR_NOT_PLAYABLE;
            }
            if (this.j == null || !t()) {
                if (!z()) {
                    return agqs.ERROR_STREAMS_MISSING;
                }
                if (this.l == agqf.STREAMS_OUT_OF_DATE) {
                    return agqs.ERROR_STREAMS_OUT_OF_DATE;
                }
                ordinal = this.l.ordinal();
                if (ordinal == 4) {
                    return agqs.ERROR_NO_STORAGE;
                }
                if (ordinal == 5) {
                    return agqs.ERROR_DISK;
                }
                if (ordinal == 6) {
                    return agqs.ERROR_NETWORK;
                }
                if (ordinal != 12) {
                    return agqs.ERROR_GENERIC;
                }
                return agqs.ERROR_STREAMS_CORRUPT;
            } else if (this.j.c()) {
                return agqs.ERROR_EXPIRED;
            } else {
                return agqs.ERROR_POLICY;
            }
        } else if (n()) {
            return agqs.PLAYABLE;
        } else {
            if (i()) {
                return agqs.CANDIDATE;
            }
            if (l()) {
                return agqs.TRANSFER_PAUSED;
            }
            if (!m()) {
                if (k()) {
                    ordinal = this.o.c;
                    if ((ordinal & 2) != 0) {
                        return agqs.TRANSFER_PENDING_NETWORK;
                    }
                    if ((ordinal & 8) != 0) {
                        return agqs.TRANSFER_PENDING_WIFI;
                    }
                    if ((ordinal & 256) == 0) {
                        if ((ordinal & 16) != 0 || (ordinal & 2048) != 0) {
                            return agqs.TRANSFER_PENDING_CHARGER;
                        }
                        if ((ordinal & 4096) != 0) {
                            return agqs.TRANSFER_PENDING_STORAGE;
                        }
                    } else if (C() && D()) {
                        return agqs.OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE;
                    } else {
                        return agqs.TRANSFER_PENDING_TOOTHFAIRY;
                    }
                }
                return agqs.TRANSFER_WAITING_IN_QUEUE;
            } else if (C() && D()) {
                return agqs.OFFLINE_IN_PROGRESS_VIDEO_PARTIALLY_PLAYABLE;
            } else {
                return agqs.TRANSFER_IN_PROGRESS;
            }
        }
    }

    public final String a(agqs agqs, Context context) {
        atdv atdv;
        String string;
        agqw agqw;
        avqc avqc;
        switch (agqs.ordinal()) {
            case 0:
                return context.getString(R.string.offline_video_deleted);
            case 1:
            case 2:
                return "";
            case 3:
                return context.getString(R.string.offline_adding_progress, new Object[]{Integer.valueOf(q())});
            case 4:
                return context.getString(R.string.offline_waiting, new Object[]{Integer.valueOf(q())});
            case 5:
                return context.getString(R.string.offline_stream_pending);
            case 6:
                return context.getString(R.string.offline_waiting_for_network);
            case 7:
                return context.getString(R.string.offline_waiting_for_wifi);
            case 8:
                return context.getString(R.string.offline_waiting_for_charger);
            case 9:
                return context.getString(R.string.offline_waiting_tap_here);
            case 10:
                return context.getString(R.string.offline_waiting_for_space);
            case 11:
                return context.getString(R.string.offline_paused, new Object[]{Integer.valueOf(q())});
            case 13:
                atdv = this.k;
                if (atdv == null) {
                    string = context.getString(R.string.offline_failed);
                } else {
                    string = atdv.c;
                }
                return string;
            case 14:
                return context.getString(R.string.offline_failed_file_not_found);
            case 15:
                return context.getString(R.string.offline_stream_corrupt);
            case 16:
                return context.getString(R.string.offline_stream_out_of_date);
            case 17:
                agqw = this.j;
                if (agqw != null) {
                    avqc = agqw.b;
                    if (!(avqc == null || (avqc.a & 16) == 0)) {
                        string = avqc.f;
                        return string;
                    }
                }
                atdv = this.k;
                if (atdv == null || (atdv.a & 2) == 0 || atdv.c.isEmpty()) {
                    string = context.getString(R.string.offline_video_not_playable);
                } else {
                    string = this.k.c;
                }
                return string;
            case 18:
                agqw = this.j;
                if (agqw != null) {
                    avqc = agqw.b;
                    if (!(avqc == null || (avqc.a & 16) == 0)) {
                        string = avqc.f;
                        return string;
                    }
                }
                string = context.getString(R.string.offline_failed);
                return string;
            case 19:
                return context.getString(R.string.offline_expired);
            case 20:
                return context.getString(R.string.offline_failed_disk_full);
            case 21:
                return context.getString(R.string.offline_failed_network_error);
            case 22:
                return context.getString(R.string.offline_failed_disk_error);
            default:
                return context.getString(R.string.offline_failed);
        }
    }

    public final boolean v() {
        boolean z = false;
        if (!(j() || l() || i())) {
            if (t() || r() || !n()) {
                z = true;
            } else if (z()) {
                return z;
            } else {
                return true;
            }
        }
        return z;
    }

    public final boolean w() {
        return (j() || t() || l() || this.l == agqf.CANNOT_OFFLINE) ? false : n() ^ 1;
    }

    public final boolean x() {
        agqw agqw = this.j;
        return !(agqw == null || agqw.b()) || this.l == agqf.CANNOT_OFFLINE;
    }

    public final boolean y() {
        agqw agqw = this.j;
        return (agqw == null || agqw.e() == null || this.l == agqf.DELETED || this.l == agqf.CANNOT_OFFLINE) ? false : true;
    }

    public final boolean z() {
        agqn agqn = this.n;
        return agqn == null || agqn.f;
    }

    public final avsj A() {
        agqp agqp = this.a;
        avre avre = agqp.e;
        avsj avsj = null;
        if (avre != null) {
            avrc avrc = avre.o;
            if (avrc == null) {
                avrc = avrc.c;
            }
            if ((avrc.a & 1) != 0) {
                avrc avrc2 = agqp.e.o;
                if (avrc2 == null) {
                    avrc2 = avrc.c;
                }
                avsj = avrc2.b;
                if (avsj == null) {
                    return avsj.h;
                }
            }
        }
        return avsj;
    }

    public final int B() {
        agqn agqn = this.n;
        if (agqn == null) {
            return 1;
        }
        return agqn.i;
    }
}
