package defpackage;

import com.google.android.youtube.R;

/* renamed from: hqd */
public final class hqd implements hqf {
    private final xhv a;
    private final hng b;

    public hqd(xhv xhv, hng hng) {
        this.a = xhv;
        this.b = hng;
    }

    public final amqp a(agqs agqs, atdv atdv) {
        boolean c = this.a.c();
        int ordinal = agqs.ordinal();
        Integer valueOf = Integer.valueOf(R.string.downloaded_video_error_unplayable_download_context);
        amqp b;
        switch (ordinal) {
            case 4:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_waiting));
            case 5:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_pending_approval_download_context));
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
                if (atdv == null) {
                    b = amqp.b(valueOf);
                } else {
                    ordinal = awah.a(atdv.b);
                    if (ordinal == 0) {
                        ordinal = 1;
                    }
                    ordinal--;
                    if (ordinal == 4) {
                        b = amqp.b(Integer.valueOf(R.string.downloaded_video_error_unplayable_content_check_download_context));
                    } else if (ordinal != 5) {
                        b = amqp.b(valueOf);
                    } else {
                        b = amqp.b(Integer.valueOf(R.string.downloaded_video_error_unplayable_age_check_download_context));
                    }
                }
                return b;
            case 14:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_streams_missing_download_context));
            case 15:
            case 17:
            case 18:
                return amqp.b(valueOf);
            case 19:
                if (!c) {
                    b = amqp.b(Integer.valueOf(R.string.downloaded_video_error_expired_disconnected_download_context));
                } else if (this.b.a) {
                    b = amqp.b(Integer.valueOf(R.string.downloaded_video_renewing));
                } else {
                    b = amqp.b(Integer.valueOf(R.string.downloaded_video_error_expired_connected_download_context));
                }
                return b;
            case 20:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_no_storage));
            case 21:
                if (c) {
                    b = amqp.b(Integer.valueOf(R.string.downloaded_video_error_network_connected_download_context));
                } else {
                    b = amqp.b(Integer.valueOf(R.string.downloaded_video_error_network_disconnected_download_context));
                }
                return b;
            case 22:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_disk_download_context));
            case 23:
                return amqp.b(Integer.valueOf(R.string.downloaded_video_error_generic));
            default:
                return ampo.a;
        }
    }
}
