package defpackage;

import android.content.Context;
import com.google.android.youtube.R;

/* renamed from: hqc */
public final class hqc {
    private final Context a;
    private final amur b;

    public hqc(Context context, hqu hqu, hqd hqd) {
        this.a = context;
        this.b = amur.a(Integer.valueOf(0), hqu, Integer.valueOf(1), hqd);
    }

    public final hkt a(int i, agqy agqy) {
        amur amur = this.b;
        Integer valueOf = Integer.valueOf(i);
        amqw.a(amur.containsKey(valueOf));
        if (agqy == null || agqy.u() == agqs.DELETED) {
            return new hkt(R.attr.ytTextDisabled, this.a.getString(R.string.downloaded_video_deleted));
        }
        agqs u = agqy.u();
        if (u == agqs.PLAYABLE || u == agqs.CANDIDATE) {
            return new hkt(R.attr.ytTextDisabled, "");
        } else if (u == agqs.TRANSFER_IN_PROGRESS) {
            String[] strArr = new String[1];
            strArr[0] = this.a.getString(R.string.downloaded_video_in_progress, new Object[]{Integer.valueOf(agqy.q())});
            return new hkt(R.attr.ytStaticBlue, strArr);
        } else {
            String string;
            amqp a = ((hqf) this.b.get(valueOf)).a(u, agqy.k);
            String[] strArr2 = new String[1];
            if (a.a()) {
                string = this.a.getString(((Integer) a.b()).intValue());
            } else {
                string = agqy.a(u, this.a);
            }
            strArr2[0] = string;
            return new hkt(R.attr.ytTextDisabled, strArr2);
        }
    }
}
