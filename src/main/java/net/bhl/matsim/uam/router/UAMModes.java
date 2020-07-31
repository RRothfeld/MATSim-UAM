package net.bhl.matsim.uam.router;

/**
 * Provides UAM trip segment identifiers. The following trips are currently being modelled: UAM access trip (via
 * traditional mode (e.g. walk, bike, car), UAM station interaction, flight segments, UAM station interaction,
 * UAM egress trip.
 *
 * @author RRothfeld (Raoul Rothfeld)
 */
public class UAMModes {
	public static final String UAM_MODE = "uam";

	public static final String UAM_ACCESS = "access_" + UAM_MODE + "_";
	public static final String UAM_EGRESS = "egress_" + UAM_MODE + "_";

	public static final String UAM_INTERACTION = UAM_MODE + "_interaction";
}