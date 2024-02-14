import { render, fireEvent, screen } from "@testing-library/react";
import { Searchbar } from "../components/Searchbar";

test("simula una búsqueda en la aplicación", () => {
  render(<Searchbar />);

  const inputElement = screen.getByPlaceholderText("Buscar libro...");
  fireEvent.change(inputElement, { target: { value: "Harry Potter" } });
  expect(inputElement.value).toBe("Harry Potter");
});
