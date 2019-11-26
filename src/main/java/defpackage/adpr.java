package defpackage;

import com.google.android.youtube.R;

/* renamed from: adpr */
public enum adpr {
    LAUNCH_CAST_FAIL_TIMEOUT(R.string.error_connecting_to_screen, false),
    LAUNCH_FAIL_DEVICE_BUSY(R.string.error_youtube_device_busy, true),
    LAUNCH_FAIL_NEEDS_INSTALL(R.string.error_youtube_tv_needs_install, false),
    LAUNCH_FAIL_TIMEOUT(R.string.error_connecting_to_screen, true),
    LOUNGE_SERVER_CONNECTION_ERROR(R.string.error_connecting_to_screen, true),
    NETWORK(R.string.error_network, true),
    UNPLAYABLE(R.string.error_unplayable_reason_unknown, true),
    UNKNOWN(R.string.mdx_error_generic, false);
    
    public final int h;
    public final boolean i;

    private adpr(int i, boolean z) {
        this.h = i;
        this.i = z;
    }

    public final String toString() {
        String name = name();
        boolean z = this.i;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(name).length() + 35);
        stringBuilder.append("RemoteError [name=");
        stringBuilder.append(name);
        stringBuilder.append(", canRetry=");
        stringBuilder.append(z);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
