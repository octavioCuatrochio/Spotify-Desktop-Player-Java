import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.Range;

import xyz.gianlu.librespot.audio.MetadataWrapper;
import xyz.gianlu.librespot.metadata.PlayableId;
import xyz.gianlu.librespot.player.Player;
import xyz.gianlu.librespot.player.Player.EventsListener;

public class EventFinishedLoading implements EventsListener {

	public EventFinishedLoading(){
		System.out.println("|| Creó el event Listener. ||");
	}

	@Override
	public void onContextChanged(@NotNull Player player, @NotNull String newUri) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTrackChanged(@NotNull Player player, @NotNull PlayableId id, @Nullable MetadataWrapper metadata,
			boolean userInitiated) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlaybackEnded(@NotNull Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlaybackPaused(@NotNull Player player, long trackTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlaybackResumed(@NotNull Player player, long trackTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTrackSeeked(@NotNull Player player, long trackTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onMetadataAvailable(@NotNull Player player, @NotNull MetadataWrapper metadata) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlaybackHaltStateChanged(@NotNull Player player, boolean halted, long trackTime) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onInactiveSession(@NotNull Player player, boolean timeout) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onVolumeChanged(@NotNull Player player, @Range(from = 0, to = 1) float volume) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPanicState(@NotNull Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStartedLoading(@NotNull Player player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinishedLoading(@NotNull Player player) {
		System.out.println("|| " + player.currentMetadata().getName() + " ||");
	}

}
