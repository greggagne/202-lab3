/** 
 * An interface for a set ADT.
 *
 * A set is an unordered collection of elements 
 * that does not contain duplicates.
 *
 * @author Greg Gagne 
 */

public interface Set
{
    /** 
     * Adds a new element to the set as long as
     * it is not present in the set.
     */
    public void add(Object element);

    /**
     * Adds an array of elements to the set as long
     * as an element is not present in the set.
     */
    public void addAll(Object[] elements);

    /**
     * Determines whether a set contains a specified element.
     *
     * Returns true if set contains element, false otherwise.
     */
    public boolean contains(Object element);

    /**
     * Returns the number of elements in the set.
     */
    public int getSize();


    /**
     * Removes the specified element from the set.
     *
     * Returns true if the element was removed, false otherwise.
     */
    public boolean remove(Object element);

    /** 
     * Creates a new set that combines the contents if this
     * set and anotherSet. If the same item occurs in each
     * set, only one item appears in the new set.
     *
     * Both this set and anotherSet are unchanged.
     *
     * Returns the new set.
     */
    public Set union(Set anotherSet);

    /**
     * Creates a new set that contains the objects that occur
     * in both this set and anotherSet.
     *
     * Both this set and anotherSet are unchanged.
     *
     * Returns the new set.
     */
    public Set intersection(Set anotherSet);
    
    /**
     * Creates a new set containing the objects that are
     * left in this set after removing those that also 
     * occur in anotherSet.
     *
     * Both this set and anotherSet are unchanged.
     *
     * Returns the new set.
     */
    public Set difference(Set anotherSet);
}
