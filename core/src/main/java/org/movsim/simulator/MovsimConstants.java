/*
 * Copyright (C) 2010, 2011, 2012 by Arne Kesting, Martin Treiber, Ralph Germ, Martin Budden
 * <movsim.org@gmail.com>
 * -----------------------------------------------------------------------------------------
 * 
 * This file is part of
 * 
 * MovSim - the multi-model open-source vehicular-traffic simulator.
 * 
 * MovSim is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * MovSim is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with MovSim. If not, see <http://www.gnu.org/licenses/>
 * or <http://www.movsim.org>.
 * 
 * -----------------------------------------------------------------------------------------
 */
package org.movsim.simulator;

import org.movsim.utilities.Units;

/**
 * The Interface MovsimConstants.
 */
public interface MovsimConstants {

    final double SMALL_VALUE = 1e-7;

    final double MAX_VEHICLE_SPEED = 200 * Units.KMH_TO_MS;

    final double GAP_INFINITY = 10000;

    final double INVALID_GAP = -1;

    final double CRITICAL_GAP = 2;

    final double FREE_SPEED = 100 * Units.KMH_TO_MS; // TODO just adhoc number for travel time definition.

    final double MIN_POSITIVE_SPEED = 1 * Units.KMH_TO_MS; // TODO just adhoc
							   // number for
							   // defining travel
							   // time.

    final String EMPTY_STRING = "";

}
