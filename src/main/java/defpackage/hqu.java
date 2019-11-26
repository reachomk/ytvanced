package defpackage;

import com.google.android.youtube.R;

/* renamed from: hqu */
public final class hqu implements hqf {
    private final xhv a;
    private final hng b;

    public hqu(xhv xhv, hng hng) {
        this.a = xhv;
        this.b = hng;
    }

    public final amqp a(agqs agqs, atdv atdv) {
        switch (agqs.ordinal()) {
            case 4:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_waiting));
            case 5:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_pending_approval_online_context));
            case 6:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_pending_network));
            case 7:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_pending_wifi));
            case 8:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_pending_charger));
            case 10:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_pending_storage));
            case 11:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_paused));
            case 13:
            case 15:
            case 17:
            case 18:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_unplayable_online_context));
            case 14:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_streams_missing_online_context));
            case 19:
                amqp b;
                if (this.b.a && this.a.c()) {
                    b = amqp.b(Integer.valueOf(R.string.downloaded_video_renewing));
                } else {
                    b = amqp.b(Integer.valueOf(R.string.downloaded_video_error_expired_online_context));
                }
                return b;
            case 20:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_no_storage));
            case 21:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_network_online_context));
            case 22:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_disk_online_context));
            case 23:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_generic));
            default:
                return ampo.a;
        }
    }
}
